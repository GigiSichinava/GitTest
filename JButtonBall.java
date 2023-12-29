import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.JButton;

public class JButtonBall extends GraphicsProgram {

    private RandomGenerator rgen = RandomGenerator.getInstance();
    private static final int NUM_ROWS = 5;
    private static final int NUM_COLS = 5;
    private GOval oval;
    private int ovalWidth, ovalHeight;

    public void init() {
        JButton right = new JButton("Move right");
        add(right, EAST);
        JButton left = new JButton("Move left");
        add(left, WEST);
        JButton down = new JButton("Move down");
        add(down, SOUTH);
        JButton up = new JButton("Move up");
        add(up, NORTH);
        addActionListeners();
    }

    public void run() {

        int height = getHeight() / NUM_ROWS;
        int width = getWidth() / NUM_COLS;
        for (int i = 0; i < NUM_ROWS; i++) {
            for (int j = 0; j < NUM_COLS; j++) {
                GRect rect = new GRect(width, height);
                rect.setFilled(true);
                rect.setColor(new Color(244, 164, 96, 128)); // Semi-transparent sandy brown
                add(rect, i * width, j * height);
            }
        }
        ovalHeight = height;
        ovalWidth = width;
        oval = new GOval(ovalWidth, ovalHeight);
        add(oval, getWidth() / 2 - ovalWidth / 2, getHeight() / 2 - ovalHeight / 2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String temp = e.getActionCommand();
        // ... existing code for movement logic ...
        // Change the color setting part to:
        Color transparentColor = new Color(255, 0, 0, 128); // Semi-transparent red
        oval.setFilled(true);
        oval.setFillColor(transparentColor);
    }
}
