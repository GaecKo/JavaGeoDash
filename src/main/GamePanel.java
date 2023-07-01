package main;

import inputs.KeyboardInputs;

import java.awt.Graphics;

import javax.swing.*;

public class GamePanel extends JPanel {
    public GamePanel() {
        addKeyListener(new KeyboardInputs());
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.fillRect(100, 100, 200, 50);

    }
}
