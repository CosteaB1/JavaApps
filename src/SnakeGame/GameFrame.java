package SnakeGame;

import javax.swing.*;

public class GameFrame extends JFrame {
    GameFrame() {
        this.add(new GamePanel()); // Game panel = new GamePanel();   this.add(panel);
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
