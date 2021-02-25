// Generated from C:/Users/thomas.king/IdeaProjects/evelang\Eve.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EveParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, Identifier=29, Number=30, WhiteSpace=31, 
		BlockComment=32, LineComment=33;
	public static final int
		RULE_mulplicitiveOperator = 0, RULE_additiveOperator = 1, RULE_expression = 2, 
		RULE_expressionList = 3, RULE_field = 4, RULE_fieldList = 5, RULE_structurePrototype = 6, 
		RULE_parameter = 7, RULE_parameterList = 8, RULE_functionPrototype = 9, 
		RULE_functionBody = 10, RULE_genericArgument = 11, RULE_genericArgumentList = 12, 
		RULE_genericArgumentsBlock = 13, RULE_genericParameter = 14, RULE_genericParameterList = 15, 
		RULE_genericParametersBlock = 16, RULE_type = 17, RULE_structureDeclaration = 18, 
		RULE_functionDeclaration = 19, RULE_memberDeclarationGet = 20, RULE_memberDeclarationSet = 21, 
		RULE_memberDeclaration = 22, RULE_compilationUnit = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"mulplicitiveOperator", "additiveOperator", "expression", "expressionList", 
			"field", "fieldList", "structurePrototype", "parameter", "parameterList", 
			"functionPrototype", "functionBody", "genericArgument", "genericArgumentList", 
			"genericArgumentsBlock", "genericParameter", "genericParameterList", 
			"genericParametersBlock", "type", "structureDeclaration", "functionDeclaration", 
			"memberDeclarationGet", "memberDeclarationSet", "memberDeclaration", 
			"compilationUnit"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'/'", "'+'", "'-'", "'.'", "'='", "'('", "')'", "'['", 
			"']'", "'val'", "','", "':'", "'->'", "'{'", "'}'", "'<'", "'>'", "'?'", 
			"'&'", "'compact'", "'expect'", "'type'", "'inline'", "'func'", "'get'", 
			"'set'", "'memb'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "Identifier", "Number", "WhiteSpace", "BlockComment", 
			"LineComment"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Eve.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EveParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MulplicitiveOperatorContext extends ParserRuleContext {
		public MulplicitiveOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulplicitiveOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EveVisitor ) return ((EveVisitor<? extends T>)visitor).visitMulplicitiveOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulplicitiveOperatorContext mulplicitiveOperator() throws RecognitionException {
		MulplicitiveOperatorContext _localctx = new MulplicitiveOperatorContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mulplicitiveOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AdditiveOperatorContext extends ParserRuleContext {
		public AdditiveOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EveVisitor ) return ((EveVisitor<? extends T>)visitor).visitAdditiveOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveOperatorContext additiveOperator() throws RecognitionException {
		AdditiveOperatorContext _localctx = new AdditiveOperatorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_additiveOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MemberGetExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(EveParser.Identifier, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public MemberGetExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EveVisitor ) return ((EveVisitor<? extends T>)visitor).visitMemberGetExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclarationExpressionContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(EveParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclarationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EveVisitor ) return ((EveVisitor<? extends T>)visitor).visitDeclarationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaExpressionContext extends ExpressionContext {
		public FunctionPrototypeContext functionPrototype() {
			return getRuleContext(FunctionPrototypeContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public LambdaExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EveVisitor ) return ((EveVisitor<? extends T>)visitor).visitLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GetExpressionContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(EveParser.Identifier, 0); }
		public GetExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EveVisitor ) return ((EveVisitor<? extends T>)visitor).visitGetExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemberCallExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(EveParser.Identifier, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public MemberCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EveVisitor ) return ((EveVisitor<? extends T>)visitor).visitMemberCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallExpressionContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(EveParser.Identifier, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public CallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EveVisitor ) return ((EveVisitor<? extends T>)visitor).visitCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulplicitiveExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MulplicitiveOperatorContext mulplicitiveOperator() {
			return getRuleContext(MulplicitiveOperatorContext.class,0);
		}
		public MulplicitiveExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EveVisitor ) return ((EveVisitor<? extends T>)visitor).visitMulplicitiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditiveExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AdditiveOperatorContext additiveOperator() {
			return getRuleContext(AdditiveOperatorContext.class,0);
		}
		public AdditiveExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EveVisitor ) return ((EveVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemberSetExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(EveParser.Identifier, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public MemberSetExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EveVisitor ) return ((EveVisitor<? extends T>)visitor).visitMemberSetExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetExpressionContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(EveParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SetExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EveVisitor ) return ((EveVisitor<? extends T>)visitor).visitSetExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealExpressionContext extends ExpressionContext {
		public List<TerminalNode> Number() { return getTokens(EveParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(EveParser.Number, i);
		}
		public RealExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EveVisitor ) return ((EveVisitor<? extends T>)visitor).visitRealExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerExpressionContext extends ExpressionContext {
		public TerminalNode Number() { return getToken(EveParser.Number, 0); }
		public IntegerExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EveVisitor ) return ((EveVisitor<? extends T>)visitor).visitIntegerExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				_localctx = new RealExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(53);
				match(Number);
				setState(54);
				match(T__4);
				setState(55);
				match(Number);
				}
				break;
			case 2:
				{
				_localctx = new IntegerExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				match(Number);
				}
				break;
			case 3:
				{
				_localctx = new LambdaExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(57);
				functionPrototype();
				setState(58);
				functionBody();
				}
				break;
			case 4:
				{
				_localctx = new GetExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				match(Identifier);
				}
				break;
			case 5:
				{
				_localctx = new SetExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				match(Identifier);
				setState(62);
				match(T__5);
				setState(63);
				expression(8);
				}
				break;
			case 6:
				{
				_localctx = new CallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64);
				match(Identifier);
				setState(65);
				match(T__6);
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__10) | (1L << Identifier) | (1L << Number))) != 0)) {
					{
					setState(66);
					expressionList();
					}
				}

				setState(69);
				match(T__7);
				}
				break;
			case 7:
				{
				_localctx = new DeclarationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				match(T__10);
				setState(71);
				match(Identifier);
				setState(72);
				match(T__5);
				setState(73);
				expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(114);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new MemberSetExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(76);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(77);
						match(T__4);
						setState(78);
						match(Identifier);
						setState(84);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__8) {
							{
							setState(79);
							match(T__8);
							setState(81);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__10) | (1L << Identifier) | (1L << Number))) != 0)) {
								{
								setState(80);
								expressionList();
								}
							}

							setState(83);
							match(T__9);
							}
						}

						setState(86);
						match(T__5);
						setState(87);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new MulplicitiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(88);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(89);
						mulplicitiveOperator();
						setState(90);
						expression(4);
						}
						break;
					case 3:
						{
						_localctx = new AdditiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(92);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(93);
						additiveOperator();
						setState(94);
						expression(3);
						}
						break;
					case 4:
						{
						_localctx = new MemberGetExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(96);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(97);
						match(T__4);
						setState(98);
						match(Identifier);
						setState(104);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
						case 1:
							{
							setState(99);
							match(T__8);
							setState(101);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__10) | (1L << Identifier) | (1L << Number))) != 0)) {
								{
								setState(100);
								expressionList();
								}
							}

							setState(103);
							match(T__9);
							}
							break;
						}
						}
						break;
					case 5:
						{
						_localctx = new MemberCallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(106);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(107);
						match(T__4);
						setState(108);
						match(Identifier);
						setState(109);
						match(T__6);
						setState(111);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__10) | (1L << Identifier) | (1L << Number))) != 0)) {
							{
							setState(110);
							expressionList();
							}
						}

						setState(113);
						match(T__7);
						}
						break;
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EveVisitor ) return ((EveVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expressionList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			expression(0);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(120);
					match(T__11);
					setState(121);
					expression(0);
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(127);
				match(T__11);
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

	public static class FieldContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(EveParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EveVisitor ) return ((EveVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(Identifier);
			setState(131);
			match(T__12);
			setState(132);
			type();
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

	public static class FieldListContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public FieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EveVisitor ) return ((EveVisitor<? extends T>)visitor).visitFieldList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldListContext fieldList() throws RecognitionException {
		FieldListContext _localctx = new FieldListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fieldList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			field();
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(135);
					match(T__11);
					setState(136);
					field();
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(142);
				match(T__11);
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

	public static class StructurePrototypeContext extends ParserRuleContext {
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public StructurePrototypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structurePrototype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EveVisitor ) return ((EveVisitor<? extends T>)visitor).visitStructurePrototype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructurePrototypeContext structurePrototype() throws RecognitionException {
		StructurePrototypeContext _localctx = new StructurePrototypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_structurePrototype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__6);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(146);
				fieldList();
				}
			}

			setState(149);
			match(T__7);
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
		public TerminalNode Identifier() { return getToken(EveParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EveVisitor ) return ((EveVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(Identifier);
			setState(152);
			match(T__12);
			setState(153);
			type();
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EveVisitor ) return ((EveVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameterList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			parameter();
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(156);
					match(T__11);
					setState(157);
					parameter();
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(163);
				match(T__11);
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

	public static class FunctionPrototypeContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionPrototypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionPrototype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EveVisitor ) return ((EveVisitor<? extends T>)visitor).visitFunctionPrototype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionPrototypeContext functionPrototype() throws RecognitionException {
		FunctionPrototypeContext _localctx = new FunctionPrototypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionPrototype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__6);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(167);
				parameterList();
				}
			}

			setState(170);
			match(T__7);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(171);
				match(T__13);
				setState(172);
				type();
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EveVisitor ) return ((EveVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionBody);
		int _la;
		try {
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				match(T__14);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__10) | (1L << Identifier) | (1L << Number))) != 0)) {
					{
					{
					setState(176);
					expression(0);
					}
					}
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(182);
				match(T__15);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(T__5);
				setState(184);
				expression(0);
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

	public static class GenericArgumentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public GenericArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericArgument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EveVisitor ) return ((EveVisitor<? extends T>)visitor).visitGenericArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericArgumentContext genericArgument() throws RecognitionException {
		GenericArgumentContext _localctx = new GenericArgumentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_genericArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			type();
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

	public static class GenericArgumentListContext extends ParserRuleContext {
		public List<GenericArgumentContext> genericArgument() {
			return getRuleContexts(GenericArgumentContext.class);
		}
		public GenericArgumentContext genericArgument(int i) {
			return getRuleContext(GenericArgumentContext.class,i);
		}
		public GenericArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericArgumentList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EveVisitor ) return ((EveVisitor<? extends T>)visitor).visitGenericArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericArgumentListContext genericArgumentList() throws RecognitionException {
		GenericArgumentListContext _localctx = new GenericArgumentListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_genericArgumentList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			genericArgument();
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(190);
					match(T__11);
					setState(191);
					genericArgument();
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(197);
				match(T__11);
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

	public static class GenericArgumentsBlockContext extends ParserRuleContext {
		public GenericArgumentListContext genericArgumentList() {
			return getRuleContext(GenericArgumentListContext.class,0);
		}
		public GenericArgumentsBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericArgumentsBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EveVisitor ) return ((EveVisitor<? extends T>)visitor).visitGenericArgumentsBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericArgumentsBlockContext genericArgumentsBlock() throws RecognitionException {
		GenericArgumentsBlockContext _localctx = new GenericArgumentsBlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_genericArgumentsBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__16);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__18) | (1L << T__19) | (1L << Identifier) | (1L << Number))) != 0)) {
				{
				setState(201);
				genericArgumentList();
				}
			}

			setState(204);
			match(T__17);
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

	public static class GenericParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(EveParser.Identifier, 0); }
		public GenericParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EveVisitor ) return ((EveVisitor<? extends T>)visitor).visitGenericParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericParameterContext genericParameter() throws RecognitionException {
		GenericParameterContext _localctx = new GenericParameterContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_genericParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(Identifier);
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

	public static class GenericParameterListContext extends ParserRuleContext {
		public List<GenericParameterContext> genericParameter() {
			return getRuleContexts(GenericParameterContext.class);
		}
		public GenericParameterContext genericParameter(int i) {
			return getRuleContext(GenericParameterContext.class,i);
		}
		public GenericParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericParameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EveVisitor ) return ((EveVisitor<? extends T>)visitor).visitGenericParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericParameterListContext genericParameterList() throws RecognitionException {
		GenericParameterListContext _localctx = new GenericParameterListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_genericParameterList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			genericParameter();
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(209);
					match(T__11);
					setState(210);
					genericParameter();
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(216);
				match(T__11);
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

	public static class GenericParametersBlockContext extends ParserRuleContext {
		public GenericParameterListContext genericParameterList() {
			return getRuleContext(GenericParameterListContext.class,0);
		}
		public GenericParametersBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericParametersBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EveVisitor ) return ((EveVisitor<? extends T>)visitor).visitGenericParametersBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericParametersBlockContext genericParametersBlock() throws RecognitionException {
		GenericParametersBlockContext _localctx = new GenericParametersBlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_genericParametersBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(T__16);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(220);
				genericParameterList();
				}
			}

			setState(223);
			match(T__17);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NamedTypeContext extends TypeContext {
		public TerminalNode Identifier() { return getToken(EveParser.Identifier, 0); }
		public GenericArgumentsBlockContext genericArgumentsBlock() {
			return getRuleContext(GenericArgumentsBlockContext.class,0);
		}
		public NamedTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EveVisitor ) return ((EveVisitor<? extends T>)visitor).visitNamedType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayTypeContext extends TypeContext {
		public TerminalNode Number() { return getToken(EveParser.Number, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArrayTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EveVisitor ) return ((EveVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StructureTypeContext extends TypeContext {
		public StructurePrototypeContext structurePrototype() {
			return getRuleContext(StructurePrototypeContext.class,0);
		}
		public StructureTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EveVisitor ) return ((EveVisitor<? extends T>)visitor).visitStructureType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OptionalTypeContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public OptionalTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EveVisitor ) return ((EveVisitor<? extends T>)visitor).visitOptionalType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReferenceTypeContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ReferenceTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EveVisitor ) return ((EveVisitor<? extends T>)visitor).visitReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionTypeContext extends TypeContext {
		public FunctionPrototypeContext functionPrototype() {
			return getRuleContext(FunctionPrototypeContext.class,0);
		}
		public FunctionTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EveVisitor ) return ((EveVisitor<? extends T>)visitor).visitFunctionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_type);
		int _la;
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new NamedTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(Identifier);
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(226);
					genericArgumentsBlock();
					}
				}

				}
				break;
			case 2:
				_localctx = new OptionalTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				match(T__18);
				setState(230);
				type();
				}
				break;
			case 3:
				_localctx = new ReferenceTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				match(T__19);
				setState(232);
				type();
				}
				break;
			case 4:
				_localctx = new ArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(233);
				match(Number);
				setState(234);
				type();
				}
				break;
			case 5:
				_localctx = new StructureTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(235);
				structurePrototype();
				}
				break;
			case 6:
				_localctx = new FunctionTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(236);
				functionPrototype();
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

	public static class StructureDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(EveParser.Identifier, 0); }
		public StructurePrototypeContext structurePrototype() {
			return getRuleContext(StructurePrototypeContext.class,0);
		}
		public GenericParametersBlockContext genericParametersBlock() {
			return getRuleContext(GenericParametersBlockContext.class,0);
		}
		public StructureDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structureDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EveVisitor ) return ((EveVisitor<? extends T>)visitor).visitStructureDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructureDeclarationContext structureDeclaration() throws RecognitionException {
		StructureDeclarationContext _localctx = new StructureDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_structureDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20 || _la==T__21) {
				{
				{
				setState(239);
				_la = _input.LA(1);
				if ( !(_la==T__20 || _la==T__21) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245);
			match(T__22);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(246);
				genericParametersBlock();
				}
			}

			setState(249);
			match(Identifier);
			setState(250);
			structurePrototype();
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(EveParser.Identifier, 0); }
		public FunctionPrototypeContext functionPrototype() {
			return getRuleContext(FunctionPrototypeContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EveVisitor ) return ((EveVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21 || _la==T__23) {
				{
				{
				setState(252);
				_la = _input.LA(1);
				if ( !(_la==T__21 || _la==T__23) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
			match(T__24);
			setState(259);
			match(Identifier);
			setState(260);
			functionPrototype();
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__14) {
				{
				setState(261);
				functionBody();
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

	public static class MemberDeclarationGetContext extends ParserRuleContext {
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public MemberDeclarationGetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclarationGet; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EveVisitor ) return ((EveVisitor<? extends T>)visitor).visitMemberDeclarationGet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationGetContext memberDeclarationGet() throws RecognitionException {
		MemberDeclarationGetContext _localctx = new MemberDeclarationGetContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_memberDeclarationGet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21 || _la==T__23) {
				{
				{
				setState(264);
				_la = _input.LA(1);
				if ( !(_la==T__21 || _la==T__23) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270);
			match(T__25);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__14) {
				{
				setState(271);
				functionBody();
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

	public static class MemberDeclarationSetContext extends ParserRuleContext {
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public MemberDeclarationSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclarationSet; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EveVisitor ) return ((EveVisitor<? extends T>)visitor).visitMemberDeclarationSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationSetContext memberDeclarationSet() throws RecognitionException {
		MemberDeclarationSetContext _localctx = new MemberDeclarationSetContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_memberDeclarationSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21 || _la==T__23) {
				{
				{
				setState(274);
				_la = _input.LA(1);
				if ( !(_la==T__21 || _la==T__23) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
			match(T__26);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__14) {
				{
				setState(281);
				functionBody();
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

	public static class MemberDeclarationContext extends ParserRuleContext {
		public TypeContext scope;
		public TerminalNode Identifier() { return getToken(EveParser.Identifier, 0); }
		public FunctionPrototypeContext functionPrototype() {
			return getRuleContext(FunctionPrototypeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MemberDeclarationGetContext memberDeclarationGet() {
			return getRuleContext(MemberDeclarationGetContext.class,0);
		}
		public MemberDeclarationSetContext memberDeclarationSet() {
			return getRuleContext(MemberDeclarationSetContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EveVisitor ) return ((EveVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_memberDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(T__27);
			setState(285);
			((MemberDeclarationContext)_localctx).scope = type();
			setState(286);
			match(T__4);
			setState(287);
			match(Identifier);
			setState(288);
			functionPrototype();
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(289);
				memberDeclarationGet();
				}
				break;
			}
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(292);
				memberDeclarationSet();
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

	public static class CompilationUnitContext extends ParserRuleContext {
		public List<StructureDeclarationContext> structureDeclaration() {
			return getRuleContexts(StructureDeclarationContext.class);
		}
		public StructureDeclarationContext structureDeclaration(int i) {
			return getRuleContext(StructureDeclarationContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public List<MemberDeclarationContext> memberDeclaration() {
			return getRuleContexts(MemberDeclarationContext.class);
		}
		public MemberDeclarationContext memberDeclaration(int i) {
			return getRuleContext(MemberDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EveVisitor ) return ((EveVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__27))) != 0)) {
				{
				setState(298);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(295);
					structureDeclaration();
					}
					break;
				case 2:
					{
					setState(296);
					functionDeclaration();
					}
					break;
				case 3:
					{
					setState(297);
					memberDeclaration();
					}
					break;
				}
				}
				setState(302);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u0132\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4F\n\4\3\4\3\4\3\4\3\4\3\4\5\4M\n\4\3\4\3\4\3\4\3\4\3\4\5\4T"+
		"\n\4\3\4\5\4W\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4h\n\4\3\4\5\4k\n\4\3\4\3\4\3\4\3\4\3\4\5\4r\n\4\3\4\7\4u\n"+
		"\4\f\4\16\4x\13\4\3\5\3\5\3\5\7\5}\n\5\f\5\16\5\u0080\13\5\3\5\5\5\u0083"+
		"\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7\u008c\n\7\f\7\16\7\u008f\13\7\3\7"+
		"\5\7\u0092\n\7\3\b\3\b\5\b\u0096\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\7\n\u00a1\n\n\f\n\16\n\u00a4\13\n\3\n\5\n\u00a7\n\n\3\13\3\13\5\13"+
		"\u00ab\n\13\3\13\3\13\3\13\5\13\u00b0\n\13\3\f\3\f\7\f\u00b4\n\f\f\f\16"+
		"\f\u00b7\13\f\3\f\3\f\3\f\5\f\u00bc\n\f\3\r\3\r\3\16\3\16\3\16\7\16\u00c3"+
		"\n\16\f\16\16\16\u00c6\13\16\3\16\5\16\u00c9\n\16\3\17\3\17\5\17\u00cd"+
		"\n\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\7\21\u00d6\n\21\f\21\16\21\u00d9"+
		"\13\21\3\21\5\21\u00dc\n\21\3\22\3\22\5\22\u00e0\n\22\3\22\3\22\3\23\3"+
		"\23\5\23\u00e6\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00f0"+
		"\n\23\3\24\7\24\u00f3\n\24\f\24\16\24\u00f6\13\24\3\24\3\24\5\24\u00fa"+
		"\n\24\3\24\3\24\3\24\3\25\7\25\u0100\n\25\f\25\16\25\u0103\13\25\3\25"+
		"\3\25\3\25\3\25\5\25\u0109\n\25\3\26\7\26\u010c\n\26\f\26\16\26\u010f"+
		"\13\26\3\26\3\26\5\26\u0113\n\26\3\27\7\27\u0116\n\27\f\27\16\27\u0119"+
		"\13\27\3\27\3\27\5\27\u011d\n\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0125"+
		"\n\30\3\30\5\30\u0128\n\30\3\31\3\31\3\31\7\31\u012d\n\31\f\31\16\31\u0130"+
		"\13\31\3\31\2\3\6\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\2\6\3\2\3\4\3\2\5\6\3\2\27\30\4\2\30\30\32\32\2\u014e\2\62\3\2\2\2\4"+
		"\64\3\2\2\2\6L\3\2\2\2\by\3\2\2\2\n\u0084\3\2\2\2\f\u0088\3\2\2\2\16\u0093"+
		"\3\2\2\2\20\u0099\3\2\2\2\22\u009d\3\2\2\2\24\u00a8\3\2\2\2\26\u00bb\3"+
		"\2\2\2\30\u00bd\3\2\2\2\32\u00bf\3\2\2\2\34\u00ca\3\2\2\2\36\u00d0\3\2"+
		"\2\2 \u00d2\3\2\2\2\"\u00dd\3\2\2\2$\u00ef\3\2\2\2&\u00f4\3\2\2\2(\u0101"+
		"\3\2\2\2*\u010d\3\2\2\2,\u0117\3\2\2\2.\u011e\3\2\2\2\60\u012e\3\2\2\2"+
		"\62\63\t\2\2\2\63\3\3\2\2\2\64\65\t\3\2\2\65\5\3\2\2\2\66\67\b\4\1\2\67"+
		"8\7 \2\289\7\7\2\29M\7 \2\2:M\7 \2\2;<\5\24\13\2<=\5\26\f\2=M\3\2\2\2"+
		">M\7\37\2\2?@\7\37\2\2@A\7\b\2\2AM\5\6\4\nBC\7\37\2\2CE\7\t\2\2DF\5\b"+
		"\5\2ED\3\2\2\2EF\3\2\2\2FG\3\2\2\2GM\7\n\2\2HI\7\r\2\2IJ\7\37\2\2JK\7"+
		"\b\2\2KM\5\6\4\3L\66\3\2\2\2L:\3\2\2\2L;\3\2\2\2L>\3\2\2\2L?\3\2\2\2L"+
		"B\3\2\2\2LH\3\2\2\2Mv\3\2\2\2NO\f\7\2\2OP\7\7\2\2PV\7\37\2\2QS\7\13\2"+
		"\2RT\5\b\5\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2UW\7\f\2\2VQ\3\2\2\2VW\3\2\2"+
		"\2WX\3\2\2\2XY\7\b\2\2Yu\5\6\4\bZ[\f\5\2\2[\\\5\2\2\2\\]\5\6\4\6]u\3\2"+
		"\2\2^_\f\4\2\2_`\5\4\3\2`a\5\6\4\5au\3\2\2\2bc\f\b\2\2cd\7\7\2\2dj\7\37"+
		"\2\2eg\7\13\2\2fh\5\b\5\2gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2ik\7\f\2\2je\3"+
		"\2\2\2jk\3\2\2\2ku\3\2\2\2lm\f\6\2\2mn\7\7\2\2no\7\37\2\2oq\7\t\2\2pr"+
		"\5\b\5\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2su\7\n\2\2tN\3\2\2\2tZ\3\2\2\2t"+
		"^\3\2\2\2tb\3\2\2\2tl\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\7\3\2\2\2"+
		"xv\3\2\2\2y~\5\6\4\2z{\7\16\2\2{}\5\6\4\2|z\3\2\2\2}\u0080\3\2\2\2~|\3"+
		"\2\2\2~\177\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0081\u0083\7\16"+
		"\2\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\t\3\2\2\2\u0084\u0085"+
		"\7\37\2\2\u0085\u0086\7\17\2\2\u0086\u0087\5$\23\2\u0087\13\3\2\2\2\u0088"+
		"\u008d\5\n\6\2\u0089\u008a\7\16\2\2\u008a\u008c\5\n\6\2\u008b\u0089\3"+
		"\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0092\7\16\2\2\u0091\u0090\3"+
		"\2\2\2\u0091\u0092\3\2\2\2\u0092\r\3\2\2\2\u0093\u0095\7\t\2\2\u0094\u0096"+
		"\5\f\7\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0098\7\n\2\2\u0098\17\3\2\2\2\u0099\u009a\7\37\2\2\u009a\u009b\7\17"+
		"\2\2\u009b\u009c\5$\23\2\u009c\21\3\2\2\2\u009d\u00a2\5\20\t\2\u009e\u009f"+
		"\7\16\2\2\u009f\u00a1\5\20\t\2\u00a0\u009e\3\2\2\2\u00a1\u00a4\3\2\2\2"+
		"\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2"+
		"\3\2\2\2\u00a5\u00a7\7\16\2\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2"+
		"\u00a7\23\3\2\2\2\u00a8\u00aa\7\t\2\2\u00a9\u00ab\5\22\n\2\u00aa\u00a9"+
		"\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00af\7\n\2\2\u00ad"+
		"\u00ae\7\20\2\2\u00ae\u00b0\5$\23\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3"+
		"\2\2\2\u00b0\25\3\2\2\2\u00b1\u00b5\7\21\2\2\u00b2\u00b4\5\6\4\2\u00b3"+
		"\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00bc\7\22\2\2\u00b9"+
		"\u00ba\7\b\2\2\u00ba\u00bc\5\6\4\2\u00bb\u00b1\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bc\27\3\2\2\2\u00bd\u00be\5$\23\2\u00be\31\3\2\2\2\u00bf\u00c4"+
		"\5\30\r\2\u00c0\u00c1\7\16\2\2\u00c1\u00c3\5\30\r\2\u00c2\u00c0\3\2\2"+
		"\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c8"+
		"\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c9\7\16\2\2\u00c8\u00c7\3\2\2\2"+
		"\u00c8\u00c9\3\2\2\2\u00c9\33\3\2\2\2\u00ca\u00cc\7\23\2\2\u00cb\u00cd"+
		"\5\32\16\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2"+
		"\u00ce\u00cf\7\24\2\2\u00cf\35\3\2\2\2\u00d0\u00d1\7\37\2\2\u00d1\37\3"+
		"\2\2\2\u00d2\u00d7\5\36\20\2\u00d3\u00d4\7\16\2\2\u00d4\u00d6\5\36\20"+
		"\2\u00d5\u00d3\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00dc\7\16\2\2"+
		"\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc!\3\2\2\2\u00dd\u00df\7"+
		"\23\2\2\u00de\u00e0\5 \21\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e2\7\24\2\2\u00e2#\3\2\2\2\u00e3\u00e5\7\37\2"+
		"\2\u00e4\u00e6\5\34\17\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00f0\3\2\2\2\u00e7\u00e8\7\25\2\2\u00e8\u00f0\5$\23\2\u00e9\u00ea\7"+
		"\26\2\2\u00ea\u00f0\5$\23\2\u00eb\u00ec\7 \2\2\u00ec\u00f0\5$\23\2\u00ed"+
		"\u00f0\5\16\b\2\u00ee\u00f0\5\24\13\2\u00ef\u00e3\3\2\2\2\u00ef\u00e7"+
		"\3\2\2\2\u00ef\u00e9\3\2\2\2\u00ef\u00eb\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef"+
		"\u00ee\3\2\2\2\u00f0%\3\2\2\2\u00f1\u00f3\t\4\2\2\u00f2\u00f1\3\2\2\2"+
		"\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7"+
		"\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f9\7\31\2\2\u00f8\u00fa\5\"\22\2"+
		"\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc"+
		"\7\37\2\2\u00fc\u00fd\5\16\b\2\u00fd\'\3\2\2\2\u00fe\u0100\t\5\2\2\u00ff"+
		"\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2"+
		"\2\2\u0102\u0104\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0105\7\33\2\2\u0105"+
		"\u0106\7\37\2\2\u0106\u0108\5\24\13\2\u0107\u0109\5\26\f\2\u0108\u0107"+
		"\3\2\2\2\u0108\u0109\3\2\2\2\u0109)\3\2\2\2\u010a\u010c\t\5\2\2\u010b"+
		"\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2"+
		"\2\2\u010e\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0112\7\34\2\2\u0111"+
		"\u0113\5\26\f\2\u0112\u0111\3\2\2\2\u0112\u0113\3\2\2\2\u0113+\3\2\2\2"+
		"\u0114\u0116\t\5\2\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115"+
		"\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a"+
		"\u011c\7\35\2\2\u011b\u011d\5\26\f\2\u011c\u011b\3\2\2\2\u011c\u011d\3"+
		"\2\2\2\u011d-\3\2\2\2\u011e\u011f\7\36\2\2\u011f\u0120\5$\23\2\u0120\u0121"+
		"\7\7\2\2\u0121\u0122\7\37\2\2\u0122\u0124\5\24\13\2\u0123\u0125\5*\26"+
		"\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\3\2\2\2\u0126\u0128"+
		"\5,\27\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128/\3\2\2\2\u0129"+
		"\u012d\5&\24\2\u012a\u012d\5(\25\2\u012b\u012d\5.\30\2\u012c\u0129\3\2"+
		"\2\2\u012c\u012a\3\2\2\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\61\3\2\2\2\u0130\u012e\3\2\2"+
		"\2*ELSVgjqtv~\u0082\u008d\u0091\u0095\u00a2\u00a6\u00aa\u00af\u00b5\u00bb"+
		"\u00c4\u00c8\u00cc\u00d7\u00db\u00df\u00e5\u00ef\u00f4\u00f9\u0101\u0108"+
		"\u010d\u0112\u0117\u011c\u0124\u0127\u012c\u012e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}