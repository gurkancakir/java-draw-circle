package com.gurkan.graphics;


import com.gurkan.graphics.comp.CircleImpl;

import javax.swing.*;
import java.awt.*;

public class Test extends JFrame {
    public static final int CANVAS_WIDTH  = 500;
    public static final int CANVAS_HEIGHT = 500;
    private CirclePanel panel;

    public Test() {
        panel = new CirclePanel(new CircleImpl());
        panel.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
        Container cp = getContentPane();
        cp.add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setTitle("Challenge #16");
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Test::new);
    }
}
