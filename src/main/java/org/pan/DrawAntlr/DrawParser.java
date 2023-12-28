// Generated from E:/maven-project/bianyi/src/main/java/org/pan/antlr/Draw.g4 by ANTLR 4.13.1
package org.pan.DrawAntlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DrawParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CONST_ID=1, PI=2, E=3, SIN=4, COS=5, TAN=6, LN=7, EXP=8, SQRT=9, ORIGIN=10, 
		SCALE=11, T=12, DRAW=13, STEP=14, TO=15, FROM=16, FOR=17, ROT=18, IS=19, 
		WS=20, SL_COMMENT1=21, SL_COMMENT2=22, ML_COMMENT1=23, SEMI=24, LPAREN=25, 
		COMMA=26, RPAREN=27, T__2=28, ADD=29, SUB=30, MUL=31, DIV=32;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_origin = 2, RULE_scale = 3, RULE_rot = 4, 
		RULE_for = 5, RULE_expr = 6, RULE_expr1 = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "origin", "scale", "rot", "for", "expr", "expr1"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"';'", "'('", "','", "')'", "'**'", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CONST_ID", "PI", "E", "SIN", "COS", "TAN", "LN", "EXP", "SQRT", 
			"ORIGIN", "SCALE", "T", "DRAW", "STEP", "TO", "FROM", "FOR", "ROT", "IS", 
			"WS", "SL_COMMENT1", "SL_COMMENT2", "ML_COMMENT1", "SEMI", "LPAREN", 
			"COMMA", "RPAREN", null, "ADD", "SUB", "MUL", "DIV"
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
	public String getGrammarFileName() { return "Draw.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    double piValue = 3.14159;
	    double eValue = 2.71828;

	public DrawParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DrawParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 396288L) != 0)) {
				{
				{
				setState(16);
				stat();
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(22);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public OriginContext origin() {
			return getRuleContext(OriginContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(DrawParser.SEMI, 0); }
		public ScaleContext scale() {
			return getRuleContext(ScaleContext.class,0);
		}
		public RotContext rot() {
			return getRuleContext(RotContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ORIGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				origin();
				setState(25);
				match(SEMI);
				}
				break;
			case SCALE:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				scale();
				setState(28);
				match(SEMI);
				}
				break;
			case ROT:
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				rot();
				setState(31);
				match(SEMI);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				for_();
				setState(34);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OriginContext extends ParserRuleContext {
		public ExprContext lhs;
		public ExprContext rhs;
		public TerminalNode ORIGIN() { return getToken(DrawParser.ORIGIN, 0); }
		public TerminalNode IS() { return getToken(DrawParser.IS, 0); }
		public TerminalNode LPAREN() { return getToken(DrawParser.LPAREN, 0); }
		public TerminalNode COMMA() { return getToken(DrawParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(DrawParser.RPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OriginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_origin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterOrigin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitOrigin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitOrigin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OriginContext origin() throws RecognitionException {
		OriginContext _localctx = new OriginContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_origin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(ORIGIN);
			setState(39);
			match(IS);
			setState(40);
			match(LPAREN);
			setState(41);
			((OriginContext)_localctx).lhs = expr(0);
			setState(42);
			match(COMMA);
			setState(43);
			((OriginContext)_localctx).rhs = expr(0);
			setState(44);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ScaleContext extends ParserRuleContext {
		public ExprContext lhs;
		public ExprContext rhs;
		public TerminalNode SCALE() { return getToken(DrawParser.SCALE, 0); }
		public TerminalNode IS() { return getToken(DrawParser.IS, 0); }
		public TerminalNode LPAREN() { return getToken(DrawParser.LPAREN, 0); }
		public TerminalNode COMMA() { return getToken(DrawParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(DrawParser.RPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ScaleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scale; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterScale(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitScale(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitScale(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaleContext scale() throws RecognitionException {
		ScaleContext _localctx = new ScaleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_scale);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(SCALE);
			setState(47);
			match(IS);
			setState(48);
			match(LPAREN);
			setState(49);
			((ScaleContext)_localctx).lhs = expr(0);
			setState(50);
			match(COMMA);
			setState(51);
			((ScaleContext)_localctx).rhs = expr(0);
			setState(52);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RotContext extends ParserRuleContext {
		public TerminalNode ROT() { return getToken(DrawParser.ROT, 0); }
		public TerminalNode IS() { return getToken(DrawParser.IS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterRot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitRot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitRot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RotContext rot() throws RecognitionException {
		RotContext _localctx = new RotContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(ROT);
			setState(55);
			match(IS);
			setState(56);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForContext extends ParserRuleContext {
		public ExprContext start_point;
		public ExprContext end_point;
		public ExprContext step_size;
		public Expr1Context horizontal_coordinate;
		public Expr1Context vertical_coordinates;
		public TerminalNode FOR() { return getToken(DrawParser.FOR, 0); }
		public TerminalNode T() { return getToken(DrawParser.T, 0); }
		public TerminalNode FROM() { return getToken(DrawParser.FROM, 0); }
		public TerminalNode TO() { return getToken(DrawParser.TO, 0); }
		public TerminalNode STEP() { return getToken(DrawParser.STEP, 0); }
		public TerminalNode DRAW() { return getToken(DrawParser.DRAW, 0); }
		public TerminalNode LPAREN() { return getToken(DrawParser.LPAREN, 0); }
		public TerminalNode COMMA() { return getToken(DrawParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(DrawParser.RPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Expr1Context> expr1() {
			return getRuleContexts(Expr1Context.class);
		}
		public Expr1Context expr1(int i) {
			return getRuleContext(Expr1Context.class,i);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(FOR);
			setState(59);
			match(T);
			setState(60);
			match(FROM);
			setState(61);
			((ForContext)_localctx).start_point = expr(0);
			setState(62);
			match(TO);
			setState(63);
			((ForContext)_localctx).end_point = expr(0);
			setState(64);
			match(STEP);
			setState(65);
			((ForContext)_localctx).step_size = expr(0);
			setState(66);
			match(DRAW);
			setState(67);
			match(LPAREN);
			setState(68);
			((ForContext)_localctx).horizontal_coordinate = expr1(0);
			setState(69);
			match(COMMA);
			setState(70);
			((ForContext)_localctx).vertical_coordinates = expr1(0);
			setState(71);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivContext extends ExprContext {
		public ExprContext lhs;
		public Token op;
		public ExprContext rhs;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUB() { return getToken(DrawParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(DrawParser.ADD, 0); }
		public DivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BracketsContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(DrawParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DrawParser.RPAREN, 0); }
		public BracketsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitBrackets(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncContext extends ExprContext {
		public Token op;
		public TerminalNode LPAREN() { return getToken(DrawParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DrawParser.RPAREN, 0); }
		public TerminalNode SIN() { return getToken(DrawParser.SIN, 0); }
		public TerminalNode COS() { return getToken(DrawParser.COS, 0); }
		public TerminalNode TAN() { return getToken(DrawParser.TAN, 0); }
		public TerminalNode LN() { return getToken(DrawParser.LN, 0); }
		public TerminalNode EXP() { return getToken(DrawParser.EXP, 0); }
		public TerminalNode SQRT() { return getToken(DrawParser.SQRT, 0); }
		public FuncContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstContext extends ExprContext {
		public TerminalNode CONST_ID() { return getToken(DrawParser.CONST_ID, 0); }
		public ConstContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitConst(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PosandnegContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ADD() { return getToken(DrawParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(DrawParser.SUB, 0); }
		public PosandnegContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterPosandneg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitPosandneg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitPosandneg(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowerContext extends ExprContext {
		public ExprContext lhs;
		public Token op;
		public ExprContext rhs;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PowerContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultDivContext extends ExprContext {
		public ExprContext lhs;
		public Token op;
		public ExprContext rhs;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(DrawParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(DrawParser.DIV, 0); }
		public MultDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterMultDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitMultDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitMultDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case SUB:
				{
				_localctx = new PosandnegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(76);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD:
					{
					setState(74);
					((PosandnegContext)_localctx).op = match(ADD);
					}
					break;
				case SUB:
					{
					setState(75);
					((PosandnegContext)_localctx).op = match(SUB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(78);
				expr(6);
				}
				break;
			case CONST_ID:
				{
				_localctx = new ConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				match(CONST_ID);
				}
				break;
			case SIN:
			case COS:
			case TAN:
			case LN:
			case EXP:
			case SQRT:
				{
				_localctx = new FuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80);
				((FuncContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1008L) != 0)) ) {
					((FuncContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(81);
				match(LPAREN);
				setState(82);
				expr(0);
				setState(83);
				match(RPAREN);
				}
				break;
			case LPAREN:
				{
				_localctx = new BracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				match(LPAREN);
				setState(86);
				expr(0);
				setState(87);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(106);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new PowerContext(new ExprContext(_parentctx, _parentState));
						((PowerContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(91);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(92);
						((PowerContext)_localctx).op = match(T__2);
						setState(93);
						((PowerContext)_localctx).rhs = expr(7);
						}
						break;
					case 2:
						{
						_localctx = new MultDivContext(new ExprContext(_parentctx, _parentState));
						((MultDivContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(94);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(97);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MUL:
							{
							setState(95);
							((MultDivContext)_localctx).op = match(MUL);
							}
							break;
						case DIV:
							{
							setState(96);
							((MultDivContext)_localctx).op = match(DIV);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(99);
						((MultDivContext)_localctx).rhs = expr(6);
						}
						break;
					case 3:
						{
						_localctx = new DivContext(new ExprContext(_parentctx, _parentState));
						((DivContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(100);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(103);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case SUB:
							{
							setState(101);
							((DivContext)_localctx).op = match(SUB);
							}
							break;
						case ADD:
							{
							setState(102);
							((DivContext)_localctx).op = match(ADD);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(105);
						((DivContext)_localctx).rhs = expr(5);
						}
						break;
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expr1Context extends ParserRuleContext {
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
	 
		public Expr1Context() { }
		public void copyFrom(Expr1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Div1Context extends Expr1Context {
		public Expr1Context lhs;
		public Token op;
		public Expr1Context rhs;
		public List<Expr1Context> expr1() {
			return getRuleContexts(Expr1Context.class);
		}
		public Expr1Context expr1(int i) {
			return getRuleContext(Expr1Context.class,i);
		}
		public TerminalNode SUB() { return getToken(DrawParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(DrawParser.ADD, 0); }
		public Div1Context(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterDiv1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitDiv1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitDiv1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Variable1Context extends Expr1Context {
		public TerminalNode T() { return getToken(DrawParser.T, 0); }
		public Variable1Context(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterVariable1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitVariable1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitVariable1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultDiv1Context extends Expr1Context {
		public Expr1Context lhs;
		public Token op;
		public Expr1Context rhs;
		public List<Expr1Context> expr1() {
			return getRuleContexts(Expr1Context.class);
		}
		public Expr1Context expr1(int i) {
			return getRuleContext(Expr1Context.class,i);
		}
		public TerminalNode MUL() { return getToken(DrawParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(DrawParser.DIV, 0); }
		public MultDiv1Context(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterMultDiv1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitMultDiv1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitMultDiv1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Posandneg1Context extends Expr1Context {
		public Token op;
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public TerminalNode ADD() { return getToken(DrawParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(DrawParser.SUB, 0); }
		public Posandneg1Context(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterPosandneg1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitPosandneg1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitPosandneg1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Const1Context extends Expr1Context {
		public TerminalNode CONST_ID() { return getToken(DrawParser.CONST_ID, 0); }
		public Const1Context(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterConst1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitConst1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitConst1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Power1Context extends Expr1Context {
		public Expr1Context lhs;
		public Token op;
		public Expr1Context rhs;
		public List<Expr1Context> expr1() {
			return getRuleContexts(Expr1Context.class);
		}
		public Expr1Context expr1(int i) {
			return getRuleContext(Expr1Context.class,i);
		}
		public Power1Context(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterPower1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitPower1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitPower1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Func1Context extends Expr1Context {
		public Token op;
		public TerminalNode LPAREN() { return getToken(DrawParser.LPAREN, 0); }
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DrawParser.RPAREN, 0); }
		public TerminalNode SIN() { return getToken(DrawParser.SIN, 0); }
		public TerminalNode COS() { return getToken(DrawParser.COS, 0); }
		public TerminalNode TAN() { return getToken(DrawParser.TAN, 0); }
		public TerminalNode LN() { return getToken(DrawParser.LN, 0); }
		public TerminalNode EXP() { return getToken(DrawParser.EXP, 0); }
		public TerminalNode SQRT() { return getToken(DrawParser.SQRT, 0); }
		public Func1Context(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterFunc1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitFunc1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitFunc1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Brackets1Context extends Expr1Context {
		public TerminalNode LPAREN() { return getToken(DrawParser.LPAREN, 0); }
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DrawParser.RPAREN, 0); }
		public Brackets1Context(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterBrackets1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitBrackets1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitBrackets1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		return expr1(0);
	}

	private Expr1Context expr1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr1Context _localctx = new Expr1Context(_ctx, _parentState);
		Expr1Context _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr1, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case SUB:
				{
				_localctx = new Posandneg1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(114);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD:
					{
					setState(112);
					((Posandneg1Context)_localctx).op = match(ADD);
					}
					break;
				case SUB:
					{
					setState(113);
					((Posandneg1Context)_localctx).op = match(SUB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(116);
				expr1(7);
				}
				break;
			case CONST_ID:
				{
				_localctx = new Const1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				match(CONST_ID);
				}
				break;
			case T:
				{
				_localctx = new Variable1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(118);
				match(T);
				}
				break;
			case SIN:
			case COS:
			case TAN:
			case LN:
			case EXP:
			case SQRT:
				{
				_localctx = new Func1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119);
				((Func1Context)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1008L) != 0)) ) {
					((Func1Context)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(120);
				match(LPAREN);
				setState(121);
				expr1(0);
				setState(122);
				match(RPAREN);
				}
				break;
			case LPAREN:
				{
				_localctx = new Brackets1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
				match(LPAREN);
				setState(125);
				expr1(0);
				setState(126);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(145);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new Power1Context(new Expr1Context(_parentctx, _parentState));
						((Power1Context)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr1);
						setState(130);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(131);
						((Power1Context)_localctx).op = match(T__2);
						setState(132);
						((Power1Context)_localctx).rhs = expr1(8);
						}
						break;
					case 2:
						{
						_localctx = new MultDiv1Context(new Expr1Context(_parentctx, _parentState));
						((MultDiv1Context)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr1);
						setState(133);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(136);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MUL:
							{
							setState(134);
							((MultDiv1Context)_localctx).op = match(MUL);
							}
							break;
						case DIV:
							{
							setState(135);
							((MultDiv1Context)_localctx).op = match(DIV);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(138);
						((MultDiv1Context)_localctx).rhs = expr1(7);
						}
						break;
					case 3:
						{
						_localctx = new Div1Context(new Expr1Context(_parentctx, _parentState));
						((Div1Context)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr1);
						setState(139);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(142);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case SUB:
							{
							setState(140);
							((Div1Context)_localctx).op = match(SUB);
							}
							break;
						case ADD:
							{
							setState(141);
							((Div1Context)_localctx).op = match(ADD);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(144);
						((Div1Context)_localctx).rhs = expr1(6);
						}
						break;
					}
					} 
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 7:
			return expr1_sempred((Expr1Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean expr1_sempred(Expr1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001 \u0097\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0005\u0000\u0012\b\u0000\n\u0000\f\u0000\u0015\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001%\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"M\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006Z\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006b\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006h\b\u0006\u0001\u0006\u0005\u0006"+
		"k\b\u0006\n\u0006\f\u0006n\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007s\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u0081\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0089\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u008f\b\u0007"+
		"\u0001\u0007\u0005\u0007\u0092\b\u0007\n\u0007\f\u0007\u0095\t\u0007\u0001"+
		"\u0007\u0000\u0002\f\u000e\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000"+
		"\u0001\u0001\u0000\u0004\t\u00a5\u0000\u0013\u0001\u0000\u0000\u0000\u0002"+
		"$\u0001\u0000\u0000\u0000\u0004&\u0001\u0000\u0000\u0000\u0006.\u0001"+
		"\u0000\u0000\u0000\b6\u0001\u0000\u0000\u0000\n:\u0001\u0000\u0000\u0000"+
		"\fY\u0001\u0000\u0000\u0000\u000e\u0080\u0001\u0000\u0000\u0000\u0010"+
		"\u0012\u0003\u0002\u0001\u0000\u0011\u0010\u0001\u0000\u0000\u0000\u0012"+
		"\u0015\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0013"+
		"\u0014\u0001\u0000\u0000\u0000\u0014\u0016\u0001\u0000\u0000\u0000\u0015"+
		"\u0013\u0001\u0000\u0000\u0000\u0016\u0017\u0005\u0000\u0000\u0001\u0017"+
		"\u0001\u0001\u0000\u0000\u0000\u0018\u0019\u0003\u0004\u0002\u0000\u0019"+
		"\u001a\u0005\u0018\u0000\u0000\u001a%\u0001\u0000\u0000\u0000\u001b\u001c"+
		"\u0003\u0006\u0003\u0000\u001c\u001d\u0005\u0018\u0000\u0000\u001d%\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0003\b\u0004\u0000\u001f \u0005\u0018"+
		"\u0000\u0000 %\u0001\u0000\u0000\u0000!\"\u0003\n\u0005\u0000\"#\u0005"+
		"\u0018\u0000\u0000#%\u0001\u0000\u0000\u0000$\u0018\u0001\u0000\u0000"+
		"\u0000$\u001b\u0001\u0000\u0000\u0000$\u001e\u0001\u0000\u0000\u0000$"+
		"!\u0001\u0000\u0000\u0000%\u0003\u0001\u0000\u0000\u0000&\'\u0005\n\u0000"+
		"\u0000\'(\u0005\u0013\u0000\u0000()\u0005\u0019\u0000\u0000)*\u0003\f"+
		"\u0006\u0000*+\u0005\u001a\u0000\u0000+,\u0003\f\u0006\u0000,-\u0005\u001b"+
		"\u0000\u0000-\u0005\u0001\u0000\u0000\u0000./\u0005\u000b\u0000\u0000"+
		"/0\u0005\u0013\u0000\u000001\u0005\u0019\u0000\u000012\u0003\f\u0006\u0000"+
		"23\u0005\u001a\u0000\u000034\u0003\f\u0006\u000045\u0005\u001b\u0000\u0000"+
		"5\u0007\u0001\u0000\u0000\u000067\u0005\u0012\u0000\u000078\u0005\u0013"+
		"\u0000\u000089\u0003\f\u0006\u00009\t\u0001\u0000\u0000\u0000:;\u0005"+
		"\u0011\u0000\u0000;<\u0005\f\u0000\u0000<=\u0005\u0010\u0000\u0000=>\u0003"+
		"\f\u0006\u0000>?\u0005\u000f\u0000\u0000?@\u0003\f\u0006\u0000@A\u0005"+
		"\u000e\u0000\u0000AB\u0003\f\u0006\u0000BC\u0005\r\u0000\u0000CD\u0005"+
		"\u0019\u0000\u0000DE\u0003\u000e\u0007\u0000EF\u0005\u001a\u0000\u0000"+
		"FG\u0003\u000e\u0007\u0000GH\u0005\u001b\u0000\u0000H\u000b\u0001\u0000"+
		"\u0000\u0000IL\u0006\u0006\uffff\uffff\u0000JM\u0005\u001d\u0000\u0000"+
		"KM\u0005\u001e\u0000\u0000LJ\u0001\u0000\u0000\u0000LK\u0001\u0000\u0000"+
		"\u0000MN\u0001\u0000\u0000\u0000NZ\u0003\f\u0006\u0006OZ\u0005\u0001\u0000"+
		"\u0000PQ\u0007\u0000\u0000\u0000QR\u0005\u0019\u0000\u0000RS\u0003\f\u0006"+
		"\u0000ST\u0005\u001b\u0000\u0000TZ\u0001\u0000\u0000\u0000UV\u0005\u0019"+
		"\u0000\u0000VW\u0003\f\u0006\u0000WX\u0005\u001b\u0000\u0000XZ\u0001\u0000"+
		"\u0000\u0000YI\u0001\u0000\u0000\u0000YO\u0001\u0000\u0000\u0000YP\u0001"+
		"\u0000\u0000\u0000YU\u0001\u0000\u0000\u0000Zl\u0001\u0000\u0000\u0000"+
		"[\\\n\u0007\u0000\u0000\\]\u0005\u001c\u0000\u0000]k\u0003\f\u0006\u0007"+
		"^a\n\u0005\u0000\u0000_b\u0005\u001f\u0000\u0000`b\u0005 \u0000\u0000"+
		"a_\u0001\u0000\u0000\u0000a`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000"+
		"\u0000ck\u0003\f\u0006\u0006dg\n\u0004\u0000\u0000eh\u0005\u001e\u0000"+
		"\u0000fh\u0005\u001d\u0000\u0000ge\u0001\u0000\u0000\u0000gf\u0001\u0000"+
		"\u0000\u0000hi\u0001\u0000\u0000\u0000ik\u0003\f\u0006\u0005j[\u0001\u0000"+
		"\u0000\u0000j^\u0001\u0000\u0000\u0000jd\u0001\u0000\u0000\u0000kn\u0001"+
		"\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000"+
		"m\r\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000or\u0006\u0007\uffff"+
		"\uffff\u0000ps\u0005\u001d\u0000\u0000qs\u0005\u001e\u0000\u0000rp\u0001"+
		"\u0000\u0000\u0000rq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000"+
		"t\u0081\u0003\u000e\u0007\u0007u\u0081\u0005\u0001\u0000\u0000v\u0081"+
		"\u0005\f\u0000\u0000wx\u0007\u0000\u0000\u0000xy\u0005\u0019\u0000\u0000"+
		"yz\u0003\u000e\u0007\u0000z{\u0005\u001b\u0000\u0000{\u0081\u0001\u0000"+
		"\u0000\u0000|}\u0005\u0019\u0000\u0000}~\u0003\u000e\u0007\u0000~\u007f"+
		"\u0005\u001b\u0000\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080o\u0001"+
		"\u0000\u0000\u0000\u0080u\u0001\u0000\u0000\u0000\u0080v\u0001\u0000\u0000"+
		"\u0000\u0080w\u0001\u0000\u0000\u0000\u0080|\u0001\u0000\u0000\u0000\u0081"+
		"\u0093\u0001\u0000\u0000\u0000\u0082\u0083\n\b\u0000\u0000\u0083\u0084"+
		"\u0005\u001c\u0000\u0000\u0084\u0092\u0003\u000e\u0007\b\u0085\u0088\n"+
		"\u0006\u0000\u0000\u0086\u0089\u0005\u001f\u0000\u0000\u0087\u0089\u0005"+
		" \u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0087\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u0092\u0003\u000e"+
		"\u0007\u0007\u008b\u008e\n\u0005\u0000\u0000\u008c\u008f\u0005\u001e\u0000"+
		"\u0000\u008d\u008f\u0005\u001d\u0000\u0000\u008e\u008c\u0001\u0000\u0000"+
		"\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000"+
		"\u0000\u0090\u0092\u0003\u000e\u0007\u0006\u0091\u0082\u0001\u0000\u0000"+
		"\u0000\u0091\u0085\u0001\u0000\u0000\u0000\u0091\u008b\u0001\u0000\u0000"+
		"\u0000\u0092\u0095\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u000f\u0001\u0000\u0000"+
		"\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u000e\u0013$LYagjlr\u0080\u0088"+
		"\u008e\u0091\u0093";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}