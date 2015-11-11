package be.ugent.neio.industry;

import be.kuleuven.cs.distrinet.jnome.core.type.RegularJavaType;
import be.kuleuven.cs.distrinet.jnome.input.Java7Factory;
import org.aikodi.chameleon.oo.method.Implementation;
import org.aikodi.chameleon.oo.method.Method;
import org.aikodi.chameleon.oo.method.RegularImplementation;
import org.aikodi.chameleon.oo.method.SimpleNameMethodHeader;
import org.aikodi.chameleon.oo.statement.Block;
import org.aikodi.chameleon.oo.type.BasicTypeReference;
import org.aikodi.chameleon.oo.type.RegularType;
import org.aikodi.chameleon.oo.type.TypeReference;
import org.aikodi.chameleon.oo.type.inheritance.SubtypeRelation;
import org.aikodi.chameleon.oo.variable.MemberVariable;
import org.aikodi.chameleon.oo.variable.RegularMemberVariable;
import org.aikodi.chameleon.support.member.simplename.method.NormalMethod;

public class NeioFactory extends Java7Factory {

    public NeioFactory() {

    }

    @Override
    public RegularType createRegularType(String name) {
        return new RegularJavaType(name);
    }

    public TypeReference createTypeReference(String name) {
        return new BasicTypeReference(name);
    }

    public SubtypeRelation createSubtypeRelation(TypeReference type) {
        return new SubtypeRelation(type);
    }

    public MemberVariable createMemberVariable(String name, TypeReference type) {
        return new RegularMemberVariable(name, type);
    }

    public Method createMethod(String methodName, String returnType) {
        return new NormalMethod(new SimpleNameMethodHeader(methodName, createTypeReference(returnType)));
    }

    public Implementation createImplementation(Block b) {
        return new RegularImplementation(b);
    }
}