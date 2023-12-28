package org.pan.drawing;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.util.ArrayList;

public class Drawing extends JFrame {
    private ArrayList<Point2D.Double> points;
    public Drawing(ArrayList<Point2D.Double> points){
        this.points = points;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        for(Point2D.Double point: points){
            drawPoint(g2d,point);
        }
    }

    private void drawPoint(Graphics2D g2d, Point2D.Double point){
        // 绘制 x 轴和 y 轴
        g2d.setColor(Color.BLACK);
        g2d.drawLine(0, 200, 400, 200);  // x 轴
        g2d.drawLine(200, 0, 200, 400);  // y 轴
        // 获取当前的仿射变换
        AffineTransform transform = g2d.getTransform();
        // 将绘图原点平移到指定的坐标点
        double x = point.getX();
        double y = point.getY();
        g2d.translate(x, y);
        // 设置绘图颜色为红色
        g2d.setColor(Color.RED);
        // 填充一个椭圆，即绘制一个小圆点
        g2d.fillOval(200, 200, 2, 2);
        // 恢复之前的仿射变换，将绘图原点还原到变换之前的位置
        g2d.setTransform(transform);

    }


}
