// Generated from E:/maven-project/bianyi/src/main/java/org/pan/antlr/Draw.g4 by ANTLR 4.13.1
package org.pan.DrawAntlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DrawParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DrawVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DrawParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(DrawParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(DrawParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawParser#origin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrigin(DrawParser.OriginContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawParser#scale}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScale(DrawParser.ScaleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawParser#rot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRot(DrawParser.RotContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(DrawParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link DrawParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(DrawParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Brackets}
	 * labeled alternative in {@link DrawParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrackets(DrawParser.BracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Func}
	 * labeled alternative in {@link DrawParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(DrawParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Const}
	 * labeled alternative in {@link DrawParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst(DrawParser.ConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Posandneg}
	 * labeled alternative in {@link DrawParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosandneg(DrawParser.PosandnegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Power}
	 * labeled alternative in {@link DrawParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(DrawParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultDiv}
	 * labeled alternative in {@link DrawParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDiv(DrawParser.MultDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Div1}
	 * labeled alternative in {@link DrawParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv1(DrawParser.Div1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable1}
	 * labeled alternative in {@link DrawParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable1(DrawParser.Variable1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code MultDiv1}
	 * labeled alternative in {@link DrawParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDiv1(DrawParser.MultDiv1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Posandneg1}
	 * labeled alternative in {@link DrawParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosandneg1(DrawParser.Posandneg1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Const1}
	 * labeled alternative in {@link DrawParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst1(DrawParser.Const1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Power1}
	 * labeled alternative in {@link DrawParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower1(DrawParser.Power1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Func1}
	 * labeled alternative in {@link DrawParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc1(DrawParser.Func1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Brackets1}
	 * labeled alternative in {@link DrawParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrackets1(DrawParser.Brackets1Context ctx);
}