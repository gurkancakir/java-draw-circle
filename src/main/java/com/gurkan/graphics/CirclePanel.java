package com.gurkan.graphics;

import com.gurkan.graphics.comp.Circle;

import javax.swing.*;
import java.awt.*;

public final class CirclePanel extends JPanel {

    private final Circle circle;

    public CirclePanel(Circle circle) {
        this.circle = circle;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.WHITE);
        circle.drawCircle(g, 150, 180, 100);
    }
}
