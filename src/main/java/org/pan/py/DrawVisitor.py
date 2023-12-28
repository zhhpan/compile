# Generated from E:/maven-project/bianyi/src/main/java/org/pan/antlr/Draw.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .DrawParser import DrawParser
else:
    from DrawParser import DrawParser

# This class defines a complete generic visitor for a parse tree produced by DrawParser.

class DrawVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by DrawParser#prog.
    def visitProg(self, ctx:DrawParser.ProgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by DrawParser#stat.
    def visitStat(self, ctx:DrawParser.StatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by DrawParser#origin.
    def visitOrigin(self, ctx:DrawParser.OriginContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by DrawParser#scale.
    def visitScale(self, ctx:DrawParser.ScaleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by DrawParser#rot.
    def visitRot(self, ctx:DrawParser.RotContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by DrawParser#for.
    def visitFor(self, ctx:DrawParser.ForContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by DrawParser#Div.
    def visitDiv(self, ctx:DrawParser.DivContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by DrawParser#Brackets.
    def visitBrackets(self, ctx:DrawParser.BracketsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by DrawParser#Func.
    def visitFunc(self, ctx:DrawParser.FuncContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by DrawParser#Const.
    def visitConst(self, ctx:DrawParser.ConstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by DrawParser#Posandneg.
    def visitPosandneg(self, ctx:DrawParser.PosandnegContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by DrawParser#Power.
    def visitPower(self, ctx:DrawParser.PowerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by DrawParser#MultDiv.
    def visitMultDiv(self, ctx:DrawParser.MultDivContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by DrawParser#Div1.
    def visitDiv1(self, ctx:DrawParser.Div1Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by DrawParser#Variable1.
    def visitVariable1(self, ctx:DrawParser.Variable1Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by DrawParser#MultDiv1.
    def visitMultDiv1(self, ctx:DrawParser.MultDiv1Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by DrawParser#Posandneg1.
    def visitPosandneg1(self, ctx:DrawParser.Posandneg1Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by DrawParser#Const1.
    def visitConst1(self, ctx:DrawParser.Const1Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by DrawParser#Power1.
    def visitPower1(self, ctx:DrawParser.Power1Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by DrawParser#Func1.
    def visitFunc1(self, ctx:DrawParser.Func1Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by DrawParser#Brackets1.
    def visitBrackets1(self, ctx:DrawParser.Brackets1Context):
        return self.visitChildren(ctx)



del DrawParser