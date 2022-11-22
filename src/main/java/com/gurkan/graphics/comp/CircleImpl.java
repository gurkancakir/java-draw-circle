package com.gurkan.graphics.comp;

import java.awt.*;

public class CircleImpl implements Circle {

    @Override
    public void drawCircle(Graphics g, int xLeft, int yTop, int diameter) {
        //g.drawRect(xLeft, yTop, diameter + 1, diameter + 1);

        Point center = new Point(xLeft + diameter / 2, yTop  + diameter / 2);
        Point previous = null;

        int radians = diameter / 2;

        g.setColor(Color.BLUE);

        double x, y;
        for (int i = 0; i <= 360; i++) {
            x = radians * Math.sin(Math.toRadians(i));
            y = radians * Math.cos(Math.toRadians(i));

            System.out.println("x=" + x + ", y=" + y + ", rad=" + Math.toRadians(i) +
                    ", sin=" + Math.sin(Math.toRadians(i)) + ", cos=" + Math.cos(Math.toRadians(i)));

            if (null != previous) {
                Point newPoint = new Point((int) x, (int) y);
                this.drawLine(g, center.add(previous), center.add(newPoint));
            }

            previous = new Point((int) x, (int) y);
        }
    }

    private void drawLine(Graphics g, Point from, Point to) {
        g.drawLine(from.getX(), from.getY(), to.getX(), to.getY());
    }
}
