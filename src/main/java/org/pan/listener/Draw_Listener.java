package org.pan.listener;

import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.pan.DrawAntlr.DrawBaseListener;
import org.pan.DrawAntlr.DrawParser;

import java.util.ArrayList;
import java.util.List;

import static org.pan.DrawAntlr.DrawParser.*;


public class Draw_Listener extends DrawBaseListener {
    //坐标平移横坐标
    double orginLeft = 0;
    //坐标平移纵坐标
    double orginRight = 0;
    //角度旋转弧度值
    double rotValue = 0;
    //横坐标比例因子
    double scaleLeft = 1;
    //纵坐标比例因子
    double scaleRight = 1;
    //用于储存语句内变量的值
    private final ParseTreeProperty<Double> values = new ParseTreeProperty<>();
    //用于存放含有变量的值
    List<ParseTreeProperty<Double>> list =new ArrayList<>();
    @Override
    public void exitOrigin(DrawParser.OriginContext ctx) {
        orginLeft = values.get(ctx.lhs);
        orginRight = values.get(ctx.rhs);
        System.out.println("origin is ("+orginLeft+" ,"+orginRight+" )");
    }

    @Override
    public void exitScale(DrawParser.ScaleContext ctx) {
        scaleLeft = values.get(ctx.lhs);
        scaleRight = values.get(ctx.rhs);
        System.out.println("scale is ("+scaleLeft+" ,"+scaleRight+" )");
    }

    @Override
    public void exitRot(DrawParser.RotContext ctx) {
        rotValue = values.get(ctx.expr());
        System.out.println("rot is "+rotValue);
    }

    @Override
    public void enterFor(ForContext ctx) {

    }

    @Override
    public void exitFor(DrawParser.ForContext ctx) {
        double start = values.get(ctx.start_point);
        double end = values.get(ctx.end_point);
        double step = values.get(ctx.step_size);
        Expr1Context horizontalCoordinate = ctx.horizontal_coordinate;
        Expr1Context verticalCoordinates = ctx.vertical_coordinates;
        ctx.expr1(0);

        for (double i = start; i < end; i+=step) {


        }

    }




    @Override
    public void exitDiv(DrawParser.DivContext ctx) {
        if(ctx.op.getType() == ADD){
            values.put(ctx,values.get(ctx.lhs)+values.get(ctx.rhs));
        } else if (ctx.op.getType() == SUB) {
            values.put(ctx,values.get(ctx.lhs)-values.get(ctx.rhs));
        }
    }

    @Override
    public void exitBrackets(DrawParser.BracketsContext ctx) {
        //消除（）的影响
        values.put(ctx,values.get(ctx.expr()));
    }

    @Override
    public void exitFunc(DrawParser.FuncContext ctx) {
        Double v = values.get(ctx.expr());
        //对符号进行判断
        if(ctx.op.getType() == SIN){
            values.put(ctx,Math.sin(v));
        } else if (ctx.op.getType() == COS) {
            values.put(ctx,Math.cos(v));
        } else if (ctx.op.getType() == TAN) {
            values.put(ctx,Math.tan(v));
        } else if (ctx.op.getType() == LN) {
            values.put(ctx,Math.log(v));
        } else if (ctx.op.getType() == EXP) {
            values.put(ctx,Math.exp(v));
        } else if (ctx.op.getType() == SQRT) {
            values.put(ctx,Math.sqrt(v));
        }
    }

    @Override
    public void exitConst(DrawParser.ConstContext ctx) {
        //取到常数的值
        Double v = Double.valueOf(ctx.CONST_ID().getText());
        //将值放入values中
        values.put(ctx,v);

    }

    @Override
    public void exitPosandneg(DrawParser.PosandnegContext ctx) {
        if(ctx.op.getType() == ADD){
            values.put(ctx,values.get(ctx.expr()));
        } else if (ctx.op.getType() == SUB) {
            values.put(ctx,-values.get(ctx.expr()));
        }
    }

    @Override
    public void exitPower(DrawParser.PowerContext ctx) {
        values.put(ctx,Math.pow(values.get(ctx.lhs),values.get(ctx.rhs)));
    }

    @Override
    public void exitMultDiv(DrawParser.MultDivContext ctx) {
        if(ctx.op.getType() == MUL){
            values.put(ctx,values.get(ctx.lhs)*values.get(ctx.rhs));
        } else if (ctx.op.getType() == DIV) {
            values.put(ctx,values.get(ctx.lhs)/values.get(ctx.rhs));
        }
    }

}
