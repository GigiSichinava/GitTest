import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JButton;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Review extends GraphicsProgram implements ComponentListener {

    private RandomGenerator rgen = RandomGenerator.getInstance();
    private static final int NUM_ROWS = 5;
    private static final int NUM_COLS = 5;
    private GOval oval;
    private int ovalWidth, ovalHeight;

    public void init() {
        // Your existing initialization code

        // Register component listener
        this.addComponentListener(this);
    }

    public void run() {
        // Your existing run method
    }

    // Component Listener methods
    @Override
    public void componentResized(ComponentEvent e) {
        updateGrid();
    }

    private void updateGrid() {
        removeAll(); // Remove all existing elements

        int height = getHeight() / NUM_ROWS;
        int width = getWidth() / NUM_COLS;

        for (int i = 0; i < NUM_ROWS; i++) {
            for (int j = 0; j < NUM_COLS; j++) {
                GRect rect = new GRect(width, height);
                rect.setFilled(true);
                rect.setFillColor(Color.white);
                add(rect, i * width, j * height);
            }
        }

        ovalWidth = width;
        ovalHeight = height;

        if (oval == null) {
            oval = new GOval(ovalWidth, ovalHeight);
            oval.setFilled(true);
            add(oval, getWidth() / 2 - ovalWidth / 2, getHeight() / 2 - ovalHeight / 2);
        } else {
            oval.setSize(ovalWidth, ovalHeight);
            // Optionally, reposition the oval as needed
        }
    }

    @Override
    public void componentMoved(ComponentEvent e) {
    }

    @Override
    public void componentShown(ComponentEvent e) {
    }

    @Override
    public void componentHidden(ComponentEvent e) {
    }

    // Your existing actionPerformed and other methods
}
