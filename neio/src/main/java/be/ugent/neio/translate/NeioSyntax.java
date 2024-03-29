package be.ugent.neio.translate;

import be.kuleuven.cs.distrinet.jnome.core.expression.invocation.ConstructorInvocation;
import be.kuleuven.cs.distrinet.jnome.core.expression.invocation.JavaInfixOperatorInvocation;
import be.kuleuven.cs.distrinet.jnome.core.type.BasicJavaTypeReference;
import be.kuleuven.cs.distrinet.jnome.output.Java7Syntax;
import be.ugent.neio.model.modifier.Nested;
import be.ugent.neio.model.modifier.Surround;
import org.aikodi.chameleon.core.element.Element;
import org.aikodi.chameleon.core.lookup.LookupException;
import org.aikodi.chameleon.core.modifier.Modifier;
import org.aikodi.chameleon.exception.ChameleonProgrammerException;
import org.aikodi.chameleon.oo.expression.Expression;
import org.aikodi.chameleon.oo.expression.Literal;
import org.aikodi.chameleon.oo.expression.NameExpression;
import org.aikodi.chameleon.oo.expression.ParExpression;
import org.aikodi.chameleon.oo.method.Method;
import org.aikodi.chameleon.oo.method.exception.ExceptionClause;
import org.aikodi.chameleon.oo.method.exception.ExceptionDeclaration;
import org.aikodi.chameleon.oo.statement.Block;
import org.aikodi.chameleon.oo.statement.Statement;
import org.aikodi.chameleon.oo.type.BasicTypeReference;
import org.aikodi.chameleon.oo.variable.FormalParameter;
import org.aikodi.chameleon.support.expression.AssignmentExpression;
import org.aikodi.chameleon.support.expression.RegularLiteral;
import org.aikodi.chameleon.support.member.simplename.method.RegularMethodInvocation;
import org.aikodi.chameleon.support.statement.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * @author Titouan Vervack
 */
public class NeioSyntax extends Java7Syntax {

    private static final Map<String, String> ALIASES;
    private static final String BS = "\\\\";
    private static final String ESC = "%neio%escape%char%";

    static {
        Map<String, String> map = new HashMap<>();
        map.put("#", "hash");
        map.put("*", "star");
        map.put("=", "equalSign");
        map.put("^", "caret");
        map.put("-", "dash");
        map.put("_", "underscore");
        map.put("`", "backquote");
        map.put("$", "dollar");
        map.put("|", "pipe");
        ALIASES = Collections.unmodifiableMap(map);
    }

    @Override
    public String toCode(Element element) {
        if (isParExpression(element)) {
            return toCodeParExpression((ParExpression) element);
        }

        return super.toCode(element);
    }

    protected boolean isParExpression(Element e) {
        return e instanceof ParExpression;
    }

    protected String toCodeParExpression(ParExpression e) {
        return "(" + toCode(e.expression()) + ")";
    }

    @Override
    protected String toCodeModifier(Modifier element) {
        if (element instanceof Nested || element instanceof Surround) {
            return "";
        } else {
            return super.toCodeModifier(element);
        }
    }

    // Used to put quotes around String literals
    @Override
    public String toCodeLiteral(Literal literal) {
        try {
            String literalText = super.toCodeLiteral(literal);
            if (literal.getType().getFullyQualifiedName().equals("java.lang.String") && !(literalText.startsWith("\"") && literalText.endsWith("\""))) {
                // Replace double backslash (escaped backslash), by an escape sequence
                literalText = literalText.replaceAll(BS + BS, ESC);
                // Replace the backslash in escaped characters with double backslash to prevent the creation of special
                // java characters such as '\n'
                literalText = literalText.replaceAll(BS + "([^rfutn" + NeioSyntax.BS + "])", BS + BS + "$1");
                // Replace the escape sequence by four backslashes (2 escaped backslashes in Java)
                literalText = literalText.replaceAll(ESC, BS + BS + BS + BS);
                literalText = literalText.replaceAll("\"", BS + '"');
                return "\"" + literalText + "\"";

            } else {
                return literalText;
            }
        } catch (LookupException e) {
            throw new ChameleonProgrammerException("Could not lookup: " + e);
        }
    }

    @Override
    public String toCodeMethod(Method method) {
        // Be sure we do not make changes to the actual method
        Method clone = (Method) method.clone();
        // Need to set parent to be able to do some lookups in super()
        clone.setUniParent(method.parent());
        clone.header().signature().setName(createValidMethodname(clone.name()));
        return super.toCodeMethod(clone);
    }

    @Override
    public String toCodeAssignment(AssignmentExpression expr) {
        String result = addCatchAll(expr.getValue());

        return result != null ? result : super.toCodeAssignment(expr);
    }

    @Override
    public String toCodeReturn(ReturnStatement stat) {
        String result = addCatchAll(stat.getExpression());

        return result != null ? result : super.toCodeReturn(stat);
    }

    @Override
    public String toCodeStatementExpression(StatementExpression stat) {
        String result = addCatchAll(stat.getExpression());

        return result != null ? result : super.toCodeStatementExpression(stat);
    }

    @Override
    public String toCodeRegularMethodInvocation(RegularMethodInvocation inv) {
        // Print with a name that Java can work with
        String old = inv.name();
        inv.setName(createValidMethodname(old));

        String result = super.toCodeRegularMethodInvocation(inv);
        inv.setName(old);

        return result;
    }

    private String addCatchAll(Expression expr) {
        if (expr == null || !(expr instanceof RegularMethodInvocation)) {
            return null;
        }
        // This will deduce if a basic try catch is needed for this statement and create it if need be
        if (expr.nearestAncestor(TryStatement.class) == null) {
            if (throwsException((RegularMethodInvocation) expr)) {
                Statement stat = expr.nearestAncestor(Statement.class);
                Block parent = (Block) stat.parent();

                Block tryBlock = new Block();
                tryBlock.addStatement(stat);

                TryStatement tryStatement = new TryStatement(tryBlock);

                // Create error message
                Literal left = new RegularLiteral(new BasicTypeReference("java.lang.String"), "Exception encountered: ");
                JavaInfixOperatorInvocation catchPrint = new JavaInfixOperatorInvocation("+", left);
                catchPrint.addArgument(new NameExpression("e"));

                // Create a throw of a NeioRuntimeException
                ConstructorInvocation runtimeException = new ConstructorInvocation(new BasicJavaTypeReference("neio.stdlib.NeioRuntimeException"), null);
                runtimeException.addArgument(catchPrint);
                ThrowStatement catchThrow = new ThrowStatement(runtimeException);

                Block catchBlock = new Block();
                catchBlock.addStatement(catchThrow);

                FormalParameter parameter = new FormalParameter("e", new BasicTypeReference("java.lang.Exception"));
                tryStatement.addCatchClause(new CatchClause(parameter, catchBlock));

                parent.removeStatement(stat);
                parent.addStatement(tryStatement);
                String result = toCode(tryStatement);
                parent.removeStatement(tryStatement);

                return result;
            }
        }

        return null;
    }

    private boolean throwsException(RegularMethodInvocation mi) {
        return throwsException(mi, true);
    }

    private boolean throwsException(RegularMethodInvocation mi, boolean retry) {
        List<ExceptionClause> list = null;
        try {
            list = mi.getElement().children(ExceptionClause.class);
        } catch (LookupException e) {
            // Retry with a, hopefully, different name
            if (retry) {
                String old = mi.name();
                fixName(mi);
                boolean result = throwsException(mi, false);
                mi.setName(old);

                return result;
            }
            System.err.println("Lookup exception when trying to find throws: " + e.getMessage());
        }

        if (list != null && !list.isEmpty()) {
            for (ExceptionClause ex : list) {
                List<ExceptionDeclaration> decl = ex.exceptionDeclarations();
                if (decl != null && !decl.isEmpty()) {
                    return true;
                }
            }
        }

        return false;
    }

    // Makes sure we're using the right name in the method invocation
    private void fixName(RegularMethodInvocation mi) {
        for (String key : ALIASES.keySet()) {
            if (mi.name().equals(ALIASES.get(key))) {
                mi.setName(key);
                return;
            }
        }
    }

    // Creates a valid method name as Neio allows for symbols in its methodnames
    private String createValidMethodname(String methodname) {
        String prefix = "";
        String result = methodname;
        if (methodname.startsWith("$")) {
            prefix = "$";
            result = methodname.substring(1);
        }
        for (String s : ALIASES.keySet()) {
            if (result.contains(s)) {
                result = result.replaceAll(Pattern.quote(s), ALIASES.get(s));
            }
        }

        if (!prefix.isEmpty()) {
            result = prefix + result;
        }
        return result;
    }
}
