// Generated from E:/maven-project/bianyi/src/main/java/org/pan/antlr/Draw.g4 by ANTLR 4.13.1
package org.pan.DrawAntlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DrawParser}.
 */
public interface DrawListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DrawParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(DrawParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(DrawParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(DrawParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(DrawParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawParser#origin}.
	 * @param ctx the parse tree
	 */
	void enterOrigin(DrawParser.OriginContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawParser#origin}.
	 * @param ctx the parse tree
	 */
	void exitOrigin(DrawParser.OriginContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawParser#scale}.
	 * @param ctx the parse tree
	 */
	void enterScale(DrawParser.ScaleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawParser#scale}.
	 * @param ctx the parse tree
	 */
	void exitScale(DrawParser.ScaleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawParser#rot}.
	 * @param ctx the parse tree
	 */
	void enterRot(DrawParser.RotContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawParser#rot}.
	 * @param ctx the parse tree
	 */
	void exitRot(DrawParser.RotContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(DrawParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(DrawParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Div}
	 * labeled alternative in {@link DrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDiv(DrawParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link DrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDiv(DrawParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Brackets}
	 * labeled alternative in {@link DrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBrackets(DrawParser.BracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Brackets}
	 * labeled alternative in {@link DrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBrackets(DrawParser.BracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Func}
	 * labeled alternative in {@link DrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunc(DrawParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Func}
	 * labeled alternative in {@link DrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunc(DrawParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Const}
	 * labeled alternative in {@link DrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConst(DrawParser.ConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Const}
	 * labeled alternative in {@link DrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConst(DrawParser.ConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Posandneg}
	 * labeled alternative in {@link DrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPosandneg(DrawParser.PosandnegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Posandneg}
	 * labeled alternative in {@link DrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPosandneg(DrawParser.PosandnegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Power}
	 * labeled alternative in {@link DrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPower(DrawParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Power}
	 * labeled alternative in {@link DrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPower(DrawParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultDiv}
	 * labeled alternative in {@link DrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultDiv(DrawParser.MultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultDiv}
	 * labeled alternative in {@link DrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultDiv(DrawParser.MultDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Div1}
	 * labeled alternative in {@link DrawParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterDiv1(DrawParser.Div1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Div1}
	 * labeled alternative in {@link DrawParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitDiv1(DrawParser.Div1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable1}
	 * labeled alternative in {@link DrawParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterVariable1(DrawParser.Variable1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable1}
	 * labeled alternative in {@link DrawParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitVariable1(DrawParser.Variable1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code MultDiv1}
	 * labeled alternative in {@link DrawParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterMultDiv1(DrawParser.MultDiv1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code MultDiv1}
	 * labeled alternative in {@link DrawParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitMultDiv1(DrawParser.MultDiv1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Posandneg1}
	 * labeled alternative in {@link DrawParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterPosandneg1(DrawParser.Posandneg1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Posandneg1}
	 * labeled alternative in {@link DrawParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitPosandneg1(DrawParser.Posandneg1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Const1}
	 * labeled alternative in {@link DrawParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterConst1(DrawParser.Const1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Const1}
	 * labeled alternative in {@link DrawParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitConst1(DrawParser.Const1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Power1}
	 * labeled alternative in {@link DrawParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterPower1(DrawParser.Power1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Power1}
	 * labeled alternative in {@link DrawParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitPower1(DrawParser.Power1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Func1}
	 * labeled alternative in {@link DrawParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterFunc1(DrawParser.Func1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Func1}
	 * labeled alternative in {@link DrawParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitFunc1(DrawParser.Func1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Brackets1}
	 * labeled alternative in {@link DrawParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterBrackets1(DrawParser.Brackets1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Brackets1}
	 * labeled alternative in {@link DrawParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitBrackets1(DrawParser.Brackets1Context ctx);
}