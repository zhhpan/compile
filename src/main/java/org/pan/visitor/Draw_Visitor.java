package org.pan.visitor;


import org.pan.DrawAntlr.DrawBaseVisitor;
import org.pan.DrawAntlr.DrawParser;
import org.pan.drawing.Drawing;

import javax.swing.*;
import java.awt.geom.Point2D;
import java.util.ArrayList;

import static org.pan.DrawAntlr.DrawParser.*;
import static org.pan.DrawAntlr.DrawParser.SQRT;


public class Draw_Visitor extends DrawBaseVisitor<Double> {

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
    //现在变量的值
    double t;
    //点的坐标
    ArrayList<Point2D.Double> list = new ArrayList<>();
    @Override
    public Double visitConst(DrawParser.ConstContext ctx) {
        return Double.valueOf(ctx.CONST_ID().getText());
    }

    @Override
    public Double visitOrigin(DrawParser.OriginContext ctx) {
        //super.visitOrigin(ctx);
        Double left = visit(ctx.lhs);
        Double right = visit(ctx.rhs);
        orginLeft = left;
        orginRight = right;
        // System.out.println("origin is ("+orginLeft+" ,"+orginRight+" )");
        return null;
    }

    @Override
    public Double visitScale(DrawParser.ScaleContext ctx) {
        Double left = visit(ctx.lhs);
        Double right = visit(ctx.rhs);
        scaleLeft = left;
        scaleRight = right;
        // System.out.println("scale is ("+scaleLeft+" ,"+scaleRight+" )");
        return null;
    }

    @Override
    public Double visitRot(DrawParser.RotContext ctx) {
        rotValue = visit(ctx.expr());
        System.out.println("rot is "+rotValue);
        return null;
    }

    @Override
    public Double visitDiv(DrawParser.DivContext ctx) {
        if(ctx.op.getType() == ADD){
            return visit(ctx.lhs)+visit(ctx.rhs);
        } else if(ctx.op.getType() == SUB) {
            return visit(ctx.lhs)-visit(ctx.rhs);
        }else {
            return null;
        }
    }

    @Override
    public Double visitBrackets(DrawParser.BracketsContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Double visitFunc(DrawParser.FuncContext ctx) {
        Double v = visit(ctx.expr());
        if (v == null){
            return null;
        }
        //对符号进行判断
        if(ctx.op.getType() == SIN){
            return Math.sin(v);
        } else if (ctx.op.getType() == COS) {
            return Math.cos(v);
        } else if (ctx.op.getType() == TAN) {
            return Math.tan(v);
        } else if (ctx.op.getType() == LN) {
            return Math.log(v);
        } else if (ctx.op.getType() == EXP) {
            return Math.exp(v);
        } else if (ctx.op.getType() == SQRT) {
            return Math.sqrt(v);
        }else {
            return null;
        }
    }

    @Override
    public Double visitPosandneg(DrawParser.PosandnegContext ctx) {
        if(ctx.op.getType() ==ADD){
            return visit(ctx.expr());
        } else if (ctx.op.getType() == SUB) {
            return -visit(ctx.expr());
        }else {
            return null;
        }
    }

    @Override
    public Double visitPower(DrawParser.PowerContext ctx) {
        return Math.pow(visit(ctx.lhs),visit(ctx.rhs));
    }

    @Override
    public Double visitMultDiv(DrawParser.MultDivContext ctx) {
        if(ctx.op.getType() == MUL){
            return visit(ctx.lhs)*visit(ctx.rhs);
        } else if(ctx.op.getType() == DIV) {
            return visit(ctx.lhs)/visit(ctx.rhs);
        }else {
            return null;
        }
    }

    @Override
    public Double visitFor(ForContext ctx) {
        double start = visit(ctx.start_point);
        double end = visit(ctx.end_point);
        double step = visit(ctx.step_size);

        for (double i = start; i <= end; i+=step) {
            t = i;
            double left = visit(ctx.horizontal_coordinate) ;
            double right = visit(ctx.vertical_coordinates) ;

            left *= scaleLeft;
            right *= scaleRight;

            double temp = left*Math.cos(rotValue)+right*Math.sin(rotValue);
            right = right*Math.cos(rotValue)+left*Math.sin(rotValue);
            left = temp;

            left += orginLeft;
            right += orginRight;

            list.add(new Point2D.Double(left,right));
        }

        // System.out.println(list);
        return null;
    }

    @Override
    public Double visitProg(ProgContext ctx) {
        super.visitProg(ctx);
        /*
        在Swing中，GUI组件应该从事件分发线程（Event Dispatch Thread，EDT）访问和修改，以确保线程安全性。invokeLater()方法是在EDT上执行代码片段的一种方式。
        这段代码的各个部分的作用如下：
        SwingUtilities.invokeLater()：该方法用于安排在事件分发线程上运行的任务。它接受一个Runnable作为参数，并确保在EDT上执行该Runnable的run()方法。
        () -> new Drawing(list)：这是一个lambda表达式。它是表示匿名函数的简洁方式。在这种情况下，它创建了Drawing类的新实例，可能将一个list作为参数传递。lambda表达式有效地实现了Runnable接口的run()方法。
         */
        System.out.println(list.size());
        SwingUtilities.invokeLater(() -> new Drawing(list));
        return null;
    }

    @Override
    public Double visitDiv1(DrawParser.Div1Context ctx) {
        if(ctx.op.getType() == ADD){
            return visit(ctx.lhs)+visit(ctx.rhs);
        } else if(ctx.op.getType() == SUB) {
            return visit(ctx.lhs)-visit(ctx.rhs);
        }else {
            return null;
        }
    }



    @Override
    public Double visitBrackets1(DrawParser.Brackets1Context ctx) {
        return visit(ctx.expr1());
    }

    @Override
    public Double visitFunc1(DrawParser.Func1Context ctx) {
        Double v = visit(ctx.expr1());
        //对符号进行判断
        if(ctx.op.getType() == SIN){
            return Math.sin(v);
        } else if (ctx.op.getType() == COS) {
            return Math.cos(v);
        } else if (ctx.op.getType() == TAN) {
            return Math.tan(v);
        } else if (ctx.op.getType() == LN) {
            return Math.log(v);
        } else if (ctx.op.getType() == EXP) {
            return Math.exp(v);
        } else if (ctx.op.getType() == SQRT) {
            return Math.sqrt(v);
        }else {
            return null;
        }
    }

    @Override
    public Double visitPosandneg1(DrawParser.Posandneg1Context ctx) {
        if(ctx.op.getType() ==ADD){
            return visit(ctx.expr1());
        } else if (ctx.op.getType() == SUB) {
            return -visit(ctx.expr1());
        }else {
            return null;
        }
    }

    @Override
    public Double visitPower1(DrawParser.Power1Context ctx) {
        return Math.pow(visit(ctx.lhs),visit(ctx.rhs));
    }

    @Override
    public Double visitMultDiv1(DrawParser.MultDiv1Context ctx) {
        if(ctx.op.getType() == MUL){
            return visit(ctx.lhs)*visit(ctx.rhs);
        } else if(ctx.op.getType() == DIV) {
            return visit(ctx.lhs)/visit(ctx.rhs);
        }else {
            return null;
        }
    }

    @Override
    public Double visitVariable1(Variable1Context ctx) {
        return t;
    }

    @Override
    public Double visitConst1(Const1Context ctx) {
        return Double.valueOf(ctx.CONST_ID().getText());
    }
}
