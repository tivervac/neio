// Generated from B:\Documents\GitHub\neio\neio\src\main\grammar\ClassParser.g4 by ANTLR 4.2.2
package be.ugent.neio.parsing;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ClassParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EXTENDS=6, NEW=11, R_CURLY_BRACE=31, R_BRACE=29, STUB=14, HEADER=1, CLASS=8, 
		L_CURLY_BRACE=30, COMMENT=2, CLASS_NAME=15, MINUS=24, RETURN=10, BIGGER=27, 
		CAMEL_CASE=16, INTERFACE=9, SEMICOLON=21, SMALLER=26, MULTILINE_COMMENT=3, 
		WS=4, L_BRACE=28, COMMA=19, EQUALS=22, NEWLINE=5, IMPLEMENTS=7, COLON=20, 
		METHOD_OPTION=13, DIGIT=32, STAR=25, PERIOD=18, VAR_WITH_TYPE=17, THIS=12, 
		METHOD_NAME=33, PLUS=23;
	public static final String[] tokenNames = {
		"<INVALID>", "HEADER", "COMMENT", "MULTILINE_COMMENT", "WS", "NEWLINE", 
		"'extends'", "'implements'", "'class'", "'interface'", "'return'", "'new'", 
		"'this'", "'nested'", "'stub'", "CLASS_NAME", "CAMEL_CASE", "VAR_WITH_TYPE", 
		"'.'", "','", "':'", "';'", "'='", "'+'", "'-'", "'*'", "'<'", "'>'", 
		"'('", "')'", "'{'", "'}'", "DIGIT", "METHOD_NAME"
	};
	public static final int
		RULE_document = 0, RULE_body = 1, RULE_classBody = 2, RULE_interfaceBody = 3, 
		RULE_extension = 4, RULE_field = 5, RULE_fieldName = 6, RULE_var = 7, 
		RULE_arguments = 8, RULE_parameter = 9, RULE_parameters = 10, RULE_method = 11, 
		RULE_decl = 12, RULE_call = 13, RULE_methodName = 14, RULE_block = 15, 
		RULE_statement = 16, RULE_methodCall = 17, RULE_assignment = 18, RULE_thisChain = 19, 
		RULE_chain = 20, RULE_newAssignment = 21, RULE_newCall = 22, RULE_returnCall = 23;
	public static final String[] ruleNames = {
		"document", "body", "classBody", "interfaceBody", "extension", "field", 
		"fieldName", "var", "arguments", "parameter", "parameters", "method", 
		"decl", "call", "methodName", "block", "statement", "methodCall", "assignment", 
		"thisChain", "chain", "newAssignment", "newCall", "returnCall"
	};

	@Override
	public String getGrammarFileName() { return "ClassParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ClassParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DocumentContext extends ParserRuleContext {
		public TerminalNode CLASS_NAME() { return getToken(ClassParser.CLASS_NAME, 0); }
		public TerminalNode EOF() { return getToken(ClassParser.EOF, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode HEADER() { return getToken(ClassParser.HEADER, 0); }
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).exitDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassParserVisitor ) return ((ClassParserVisitor<? extends T>)visitor).visitDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); match(HEADER);
			setState(49); match(CLASS_NAME);
			setState(50); body();
			setState(51); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassParserVisitor ) return ((ClassParserVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		try {
			setState(55);
			switch (_input.LA(1)) {
			case EOF:
			case EXTENDS:
			case IMPLEMENTS:
			case METHOD_OPTION:
			case CLASS_NAME:
			case CAMEL_CASE:
			case VAR_WITH_TYPE:
			case METHOD_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(53); classBody();
				}
				break;
			case STUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(54); interfaceBody();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public ExtensionContext extension(int i) {
			return getRuleContext(ExtensionContext.class,i);
		}
		public List<ExtensionContext> extension() {
			return getRuleContexts(ExtensionContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassParserVisitor ) return ((ClassParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EXTENDS || _la==IMPLEMENTS) {
				{
				{
				setState(57); extension();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << METHOD_OPTION) | (1L << CLASS_NAME) | (1L << CAMEL_CASE) | (1L << VAR_WITH_TYPE) | (1L << METHOD_NAME))) != 0)) {
				{
				setState(65);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(63); field();
					}
					break;

				case 2:
					{
					setState(64); method();
					}
					break;
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode STUB() { return getToken(ClassParser.STUB, 0); }
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).exitInterfaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassParserVisitor ) return ((ClassParserVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_interfaceBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); match(STUB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtensionContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(ClassParser.SEMICOLON, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(ClassParser.IMPLEMENTS, 0); }
		public TerminalNode EXTENDS() { return getToken(ClassParser.EXTENDS, 0); }
		public ExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).enterExtension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).exitExtension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassParserVisitor ) return ((ClassParserVisitor<? extends T>)visitor).visitExtension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtensionContext extension() throws RecognitionException {
		ExtensionContext _localctx = new ExtensionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_extension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			switch (_input.LA(1)) {
			case EXTENDS:
				{
				setState(72); match(EXTENDS);
				setState(73); chain();
				}
				break;
			case IMPLEMENTS:
				{
				setState(74); match(IMPLEMENTS);
				setState(75); chain();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(78); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(ClassParser.SEMICOLON, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassParserVisitor ) return ((ClassParserVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); var();
			setState(81); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldNameContext extends ParserRuleContext {
		public TerminalNode CLASS_NAME() { return getToken(ClassParser.CLASS_NAME, 0); }
		public TerminalNode VAR_WITH_TYPE() { return getToken(ClassParser.VAR_WITH_TYPE, 0); }
		public FieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).enterFieldName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).exitFieldName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassParserVisitor ) return ((ClassParserVisitor<? extends T>)visitor).visitFieldName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldNameContext fieldName() throws RecognitionException {
		FieldNameContext _localctx = new FieldNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fieldName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_la = _input.LA(1);
			if ( !(_la==CLASS_NAME || _la==VAR_WITH_TYPE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public TerminalNode CAMEL_CASE() { return getToken(ClassParser.CAMEL_CASE, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassParserVisitor ) return ((ClassParserVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); fieldName();
			setState(86); match(CAMEL_CASE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClassParser.COMMA); }
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(ClassParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassParserVisitor ) return ((ClassParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arguments);
		try {
			int _alt;
			setState(98);
			switch (_input.LA(1)) {
			case CLASS_NAME:
			case VAR_WITH_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(88); var();
						setState(89); match(COMMA);
						}
						} 
					}
					setState(95);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(96); var();
				}
				break;
			case R_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode CAMEL_CASE() { return getToken(ClassParser.CAMEL_CASE, 0); }
		public TerminalNode DIGIT(int i) {
			return getToken(ClassParser.DIGIT, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(ClassParser.DIGIT); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassParserVisitor ) return ((ClassParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameter);
		int _la;
		try {
			setState(114);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100); match(CAMEL_CASE);
				setState(106);
				_la = _input.LA(1);
				if (_la==DIGIT) {
					{
					setState(102); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(101); match(DIGIT);
						}
						}
						setState(104); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==DIGIT );
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108); methodCall();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(109); match(DIGIT);
					}
					}
					setState(112); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClassParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClassParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassParserVisitor ) return ((ClassParserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameters);
		try {
			int _alt;
			setState(126);
			switch (_input.LA(1)) {
			case CLASS_NAME:
			case CAMEL_CASE:
			case DIGIT:
			case METHOD_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(116); parameter();
						setState(117); match(COMMA);
						}
						} 
					}
					setState(123);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(124); parameter();
				}
				break;
			case R_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodContext extends ParserRuleContext {
		public TerminalNode METHOD_OPTION() { return getToken(ClassParser.METHOD_OPTION, 0); }
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode L_CURLY_BRACE() { return getToken(ClassParser.L_CURLY_BRACE, 0); }
		public TerminalNode R_CURLY_BRACE() { return getToken(ClassParser.R_CURLY_BRACE, 0); }
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassParserVisitor ) return ((ClassParserVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_la = _input.LA(1);
			if (_la==METHOD_OPTION) {
				{
				setState(128); match(METHOD_OPTION);
				}
			}

			setState(131); decl();
			setState(132); match(L_CURLY_BRACE);
			setState(134);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << CLASS_NAME) | (1L << CAMEL_CASE) | (1L << VAR_WITH_TYPE) | (1L << METHOD_NAME))) != 0)) {
				{
				setState(133); block();
				}
			}

			setState(136); match(R_CURLY_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public TerminalNode R_BRACE() { return getToken(ClassParser.R_BRACE, 0); }
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode CLASS_NAME() { return getToken(ClassParser.CLASS_NAME, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode L_BRACE() { return getToken(ClassParser.L_BRACE, 0); }
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassParserVisitor ) return ((ClassParserVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(138); match(CLASS_NAME);
				}
				break;
			}
			setState(141); methodName();
			setState(142); match(L_BRACE);
			setState(143); arguments();
			setState(144); match(R_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallContext extends ParserRuleContext {
		public TerminalNode R_BRACE() { return getToken(ClassParser.R_BRACE, 0); }
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode L_BRACE() { return getToken(ClassParser.L_BRACE, 0); }
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassParserVisitor ) return ((ClassParserVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); methodName();
			setState(147); match(L_BRACE);
			setState(148); parameters();
			setState(149); match(R_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode CLASS_NAME() { return getToken(ClassParser.CLASS_NAME, 0); }
		public TerminalNode CAMEL_CASE() { return getToken(ClassParser.CAMEL_CASE, 0); }
		public TerminalNode METHOD_NAME() { return getToken(ClassParser.METHOD_NAME, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).exitMethodName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassParserVisitor ) return ((ClassParserVisitor<? extends T>)visitor).visitMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_methodName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS_NAME) | (1L << CAMEL_CASE) | (1L << METHOD_NAME))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public ReturnCallContext returnCall() {
			return getRuleContext(ReturnCallContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassParserVisitor ) return ((ClassParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(153); statement();
				}
				}
				setState(156); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << CLASS_NAME) | (1L << CAMEL_CASE) | (1L << VAR_WITH_TYPE) | (1L << METHOD_NAME))) != 0) );
			setState(159);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(158); returnCall();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(ClassParser.SEMICOLON, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public NewAssignmentContext newAssignment() {
			return getRuleContext(NewAssignmentContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassParserVisitor ) return ((ClassParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(161); assignment();
				}
				break;

			case 2:
				{
				setState(162); methodCall();
				}
				break;

			case 3:
				{
				setState(163); newAssignment();
				}
				break;
			}
			setState(166); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallContext extends ParserRuleContext {
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public TerminalNode PERIOD() { return getToken(ClassParser.PERIOD, 0); }
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassParserVisitor ) return ((ClassParserVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_methodCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(168); chain();
				setState(169); match(PERIOD);
				}
				break;
			}
			setState(173); call();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(ClassParser.EQUALS, 0); }
		public List<ThisChainContext> thisChain() {
			return getRuleContexts(ThisChainContext.class);
		}
		public ThisChainContext thisChain(int i) {
			return getRuleContext(ThisChainContext.class,i);
		}
		public List<TerminalNode> CAMEL_CASE() { return getTokens(ClassParser.CAMEL_CASE); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode CAMEL_CASE(int i) {
			return getToken(ClassParser.CAMEL_CASE, i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassParserVisitor ) return ((ClassParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(175); thisChain();
				}
				break;

			case 2:
				{
				setState(176); var();
				}
				break;

			case 3:
				{
				setState(177); match(CAMEL_CASE);
				}
				break;
			}
			setState(180); match(EQUALS);
			setState(184);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(181); match(CAMEL_CASE);
				}
				break;

			case 2:
				{
				setState(182); thisChain();
				}
				break;

			case 3:
				{
				setState(183); methodCall();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThisChainContext extends ParserRuleContext {
		public TerminalNode CLASS_NAME() { return getToken(ClassParser.CLASS_NAME, 0); }
		public TerminalNode CAMEL_CASE() { return getToken(ClassParser.CAMEL_CASE, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public TerminalNode THIS() { return getToken(ClassParser.THIS, 0); }
		public List<TerminalNode> PERIOD() { return getTokens(ClassParser.PERIOD); }
		public TerminalNode PERIOD(int i) {
			return getToken(ClassParser.PERIOD, i);
		}
		public ThisChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thisChain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).enterThisChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).exitThisChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassParserVisitor ) return ((ClassParserVisitor<? extends T>)visitor).visitThisChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThisChainContext thisChain() throws RecognitionException {
		ThisChainContext _localctx = new ThisChainContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_thisChain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_la = _input.LA(1);
			if (_la==THIS) {
				{
				setState(186); match(THIS);
				setState(187); match(PERIOD);
				}
			}

			setState(194);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(190); chain();
				setState(191); match(PERIOD);
				}
				break;

			case 2:
				{
				setState(193);
				_la = _input.LA(1);
				if ( !(_la==CLASS_NAME || _la==CAMEL_CASE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChainContext extends ParserRuleContext {
		public TerminalNode CLASS_NAME(int i) {
			return getToken(ClassParser.CLASS_NAME, i);
		}
		public List<TerminalNode> CLASS_NAME() { return getTokens(ClassParser.CLASS_NAME); }
		public List<TerminalNode> CAMEL_CASE() { return getTokens(ClassParser.CAMEL_CASE); }
		public TerminalNode CAMEL_CASE(int i) {
			return getToken(ClassParser.CAMEL_CASE, i);
		}
		public List<TerminalNode> PERIOD() { return getTokens(ClassParser.PERIOD); }
		public TerminalNode PERIOD(int i) {
			return getToken(ClassParser.PERIOD, i);
		}
		public ChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).enterChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).exitChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassParserVisitor ) return ((ClassParserVisitor<? extends T>)visitor).visitChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChainContext chain() throws RecognitionException {
		ChainContext _localctx = new ChainContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_chain);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_la = _input.LA(1);
			if ( !(_la==CLASS_NAME || _la==CAMEL_CASE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(197); match(PERIOD);
					setState(198);
					_la = _input.LA(1);
					if ( !(_la==CLASS_NAME || _la==CAMEL_CASE) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewAssignmentContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(ClassParser.EQUALS, 0); }
		public TerminalNode CAMEL_CASE() { return getToken(ClassParser.CAMEL_CASE, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public NewCallContext newCall() {
			return getRuleContext(NewCallContext.class,0);
		}
		public NewAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).enterNewAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).exitNewAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassParserVisitor ) return ((ClassParserVisitor<? extends T>)visitor).visitNewAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewAssignmentContext newAssignment() throws RecognitionException {
		NewAssignmentContext _localctx = new NewAssignmentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_newAssignment);
		try {
			setState(213);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(204); newCall();
				setState(205); match(CAMEL_CASE);
				}
				break;
			case CLASS_NAME:
			case CAMEL_CASE:
			case VAR_WITH_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				switch (_input.LA(1)) {
				case CLASS_NAME:
				case VAR_WITH_TYPE:
					{
					setState(207); var();
					}
					break;
				case CAMEL_CASE:
					{
					setState(208); match(CAMEL_CASE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(211); match(EQUALS);
				setState(212); newCall();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewCallContext extends ParserRuleContext {
		public TerminalNode R_BRACE() { return getToken(ClassParser.R_BRACE, 0); }
		public TerminalNode CLASS_NAME() { return getToken(ClassParser.CLASS_NAME, 0); }
		public TerminalNode VAR_WITH_TYPE() { return getToken(ClassParser.VAR_WITH_TYPE, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode NEW() { return getToken(ClassParser.NEW, 0); }
		public TerminalNode L_BRACE() { return getToken(ClassParser.L_BRACE, 0); }
		public NewCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).enterNewCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).exitNewCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassParserVisitor ) return ((ClassParserVisitor<? extends T>)visitor).visitNewCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewCallContext newCall() throws RecognitionException {
		NewCallContext _localctx = new NewCallContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_newCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215); match(NEW);
			setState(216);
			_la = _input.LA(1);
			if ( !(_la==CLASS_NAME || _la==VAR_WITH_TYPE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(217); match(L_BRACE);
			setState(218); parameters();
			setState(219); match(R_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnCallContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(ClassParser.SEMICOLON, 0); }
		public TerminalNode RETURN() { return getToken(ClassParser.RETURN, 0); }
		public TerminalNode CAMEL_CASE() { return getToken(ClassParser.CAMEL_CASE, 0); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public NewCallContext newCall() {
			return getRuleContext(NewCallContext.class,0);
		}
		public ReturnCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).enterReturnCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassParserListener ) ((ClassParserListener)listener).exitReturnCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassParserVisitor ) return ((ClassParserVisitor<? extends T>)visitor).visitReturnCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnCallContext returnCall() throws RecognitionException {
		ReturnCallContext _localctx = new ReturnCallContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_returnCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(221); match(RETURN);
				setState(222); newCall();
				}
				break;

			case 2:
				{
				setState(223); match(RETURN);
				setState(224); match(CAMEL_CASE);
				}
				break;

			case 3:
				{
				setState(225); match(RETURN);
				setState(226); methodCall();
				}
				break;
			}
			setState(229); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\u00ea\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\5\3:\n\3\3\4\7\4=\n\4\f\4\16\4@\13\4\3\4"+
		"\3\4\7\4D\n\4\f\4\16\4G\13\4\3\5\3\5\3\6\3\6\3\6\3\6\5\6O\n\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\7\n^\n\n\f\n\16\na\13\n\3"+
		"\n\3\n\5\ne\n\n\3\13\3\13\6\13i\n\13\r\13\16\13j\5\13m\n\13\3\13\3\13"+
		"\6\13q\n\13\r\13\16\13r\5\13u\n\13\3\f\3\f\3\f\7\fz\n\f\f\f\16\f}\13\f"+
		"\3\f\3\f\5\f\u0081\n\f\3\r\5\r\u0084\n\r\3\r\3\r\3\r\5\r\u0089\n\r\3\r"+
		"\3\r\3\16\5\16\u008e\n\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\21\6\21\u009d\n\21\r\21\16\21\u009e\3\21\5\21\u00a2"+
		"\n\21\3\22\3\22\3\22\5\22\u00a7\n\22\3\22\3\22\3\23\3\23\3\23\5\23\u00ae"+
		"\n\23\3\23\3\23\3\24\3\24\3\24\5\24\u00b5\n\24\3\24\3\24\3\24\3\24\5\24"+
		"\u00bb\n\24\3\25\3\25\5\25\u00bf\n\25\3\25\3\25\3\25\3\25\5\25\u00c5\n"+
		"\25\3\26\3\26\3\26\7\26\u00ca\n\26\f\26\16\26\u00cd\13\26\3\27\3\27\3"+
		"\27\3\27\3\27\5\27\u00d4\n\27\3\27\3\27\5\27\u00d8\n\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00e6\n\31\3\31\3\31"+
		"\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\5\4"+
		"\2\21\21\23\23\4\2\21\22##\3\2\21\22\u00f2\2\62\3\2\2\2\49\3\2\2\2\6>"+
		"\3\2\2\2\bH\3\2\2\2\nN\3\2\2\2\fR\3\2\2\2\16U\3\2\2\2\20W\3\2\2\2\22d"+
		"\3\2\2\2\24t\3\2\2\2\26\u0080\3\2\2\2\30\u0083\3\2\2\2\32\u008d\3\2\2"+
		"\2\34\u0094\3\2\2\2\36\u0099\3\2\2\2 \u009c\3\2\2\2\"\u00a6\3\2\2\2$\u00ad"+
		"\3\2\2\2&\u00b4\3\2\2\2(\u00be\3\2\2\2*\u00c6\3\2\2\2,\u00d7\3\2\2\2."+
		"\u00d9\3\2\2\2\60\u00e5\3\2\2\2\62\63\7\3\2\2\63\64\7\21\2\2\64\65\5\4"+
		"\3\2\65\66\7\2\2\3\66\3\3\2\2\2\67:\5\6\4\28:\5\b\5\29\67\3\2\2\298\3"+
		"\2\2\2:\5\3\2\2\2;=\5\n\6\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?E"+
		"\3\2\2\2@>\3\2\2\2AD\5\f\7\2BD\5\30\r\2CA\3\2\2\2CB\3\2\2\2DG\3\2\2\2"+
		"EC\3\2\2\2EF\3\2\2\2F\7\3\2\2\2GE\3\2\2\2HI\7\20\2\2I\t\3\2\2\2JK\7\b"+
		"\2\2KO\5*\26\2LM\7\t\2\2MO\5*\26\2NJ\3\2\2\2NL\3\2\2\2OP\3\2\2\2PQ\7\27"+
		"\2\2Q\13\3\2\2\2RS\5\20\t\2ST\7\27\2\2T\r\3\2\2\2UV\t\2\2\2V\17\3\2\2"+
		"\2WX\5\16\b\2XY\7\22\2\2Y\21\3\2\2\2Z[\5\20\t\2[\\\7\25\2\2\\^\3\2\2\2"+
		"]Z\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2be\5\20\t"+
		"\2ce\3\2\2\2d_\3\2\2\2dc\3\2\2\2e\23\3\2\2\2fl\7\22\2\2gi\7\"\2\2hg\3"+
		"\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lh\3\2\2\2lm\3\2\2\2mu\3"+
		"\2\2\2nu\5$\23\2oq\7\"\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3"+
		"\2\2\2tf\3\2\2\2tn\3\2\2\2tp\3\2\2\2u\25\3\2\2\2vw\5\24\13\2wx\7\25\2"+
		"\2xz\3\2\2\2yv\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2"+
		"\2~\u0081\5\24\13\2\177\u0081\3\2\2\2\u0080{\3\2\2\2\u0080\177\3\2\2\2"+
		"\u0081\27\3\2\2\2\u0082\u0084\7\17\2\2\u0083\u0082\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\5\32\16\2\u0086\u0088\7 \2\2"+
		"\u0087\u0089\5 \21\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u008b\7!\2\2\u008b\31\3\2\2\2\u008c\u008e\7\21\2\2\u008d"+
		"\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\5\36"+
		"\20\2\u0090\u0091\7\36\2\2\u0091\u0092\5\22\n\2\u0092\u0093\7\37\2\2\u0093"+
		"\33\3\2\2\2\u0094\u0095\5\36\20\2\u0095\u0096\7\36\2\2\u0096\u0097\5\26"+
		"\f\2\u0097\u0098\7\37\2\2\u0098\35\3\2\2\2\u0099\u009a\t\3\2\2\u009a\37"+
		"\3\2\2\2\u009b\u009d\5\"\22\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2"+
		"\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u00a2"+
		"\5\60\31\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2!\3\2\2\2\u00a3"+
		"\u00a7\5&\24\2\u00a4\u00a7\5$\23\2\u00a5\u00a7\5,\27\2\u00a6\u00a3\3\2"+
		"\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00a9\7\27\2\2\u00a9#\3\2\2\2\u00aa\u00ab\5*\26\2\u00ab\u00ac\7\24\2"+
		"\2\u00ac\u00ae\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af"+
		"\3\2\2\2\u00af\u00b0\5\34\17\2\u00b0%\3\2\2\2\u00b1\u00b5\5(\25\2\u00b2"+
		"\u00b5\5\20\t\2\u00b3\u00b5\7\22\2\2\u00b4\u00b1\3\2\2\2\u00b4\u00b2\3"+
		"\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00ba\7\30\2\2\u00b7"+
		"\u00bb\7\22\2\2\u00b8\u00bb\5(\25\2\u00b9\u00bb\5$\23\2\u00ba\u00b7\3"+
		"\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\'\3\2\2\2\u00bc\u00bd"+
		"\7\16\2\2\u00bd\u00bf\7\24\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2"+
		"\u00bf\u00c4\3\2\2\2\u00c0\u00c1\5*\26\2\u00c1\u00c2\7\24\2\2\u00c2\u00c5"+
		"\3\2\2\2\u00c3\u00c5\t\4\2\2\u00c4\u00c0\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5"+
		")\3\2\2\2\u00c6\u00cb\t\4\2\2\u00c7\u00c8\7\24\2\2\u00c8\u00ca\t\4\2\2"+
		"\u00c9\u00c7\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc"+
		"\3\2\2\2\u00cc+\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\5.\30\2\u00cf"+
		"\u00d0\7\22\2\2\u00d0\u00d8\3\2\2\2\u00d1\u00d4\5\20\t\2\u00d2\u00d4\7"+
		"\22\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d6\7\30\2\2\u00d6\u00d8\5.\30\2\u00d7\u00ce\3\2\2\2\u00d7\u00d3\3"+
		"\2\2\2\u00d8-\3\2\2\2\u00d9\u00da\7\r\2\2\u00da\u00db\t\2\2\2\u00db\u00dc"+
		"\7\36\2\2\u00dc\u00dd\5\26\f\2\u00dd\u00de\7\37\2\2\u00de/\3\2\2\2\u00df"+
		"\u00e0\7\f\2\2\u00e0\u00e6\5.\30\2\u00e1\u00e2\7\f\2\2\u00e2\u00e6\7\22"+
		"\2\2\u00e3\u00e4\7\f\2\2\u00e4\u00e6\5$\23\2\u00e5\u00df\3\2\2\2\u00e5"+
		"\u00e1\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\7\27"+
		"\2\2\u00e8\61\3\2\2\2\369>CEN_djlrt{\u0080\u0083\u0088\u008d\u009e\u00a1"+
		"\u00a6\u00ad\u00b4\u00ba\u00be\u00c4\u00cb\u00d3\u00d7\u00e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}