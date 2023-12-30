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
		ovalHeight = height;
		ovalWidth = width;
		oval = new GOval(ovalWidth, ovalHeight);
		oval.setFilled(true);
		add(oval, getWidth() / 2 - ovalWidth / 2, getHeight() / 2 - ovalHeight / 2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String temp = e.getActionCommand();
		if (temp.equals("Move right")) {
			if (oval.getX() > 4 * ovalWidth) {
				return;
			} else {
				oval.setFilled(true);
				oval.setColor(rgen.nextColor());
				oval.move(ovalWidth, 0);
			}
		} else if (temp.equals("Move left")) {

			if (oval.getX() < ovalWidth / 2) {
				return;
			} else {
				oval.setFilled(true);
				oval.setColor(rgen.nextColor());
				oval.move(-ovalWidth, 0);

			}
		} else if (temp.equals("Move down")) {
			if (oval.getY() > 4 * ovalHeight) {
				return;
			} else {
				oval.setFilled(true);
				oval.setColor(rgen.nextColor());
				oval.move(0, ovalHeight);
			}
		} else if (temp.equals("Move up")) {
			if (oval.getY() < ovalHeight / 2) {
				return;
			} else {
				oval.setFilled(true);
				oval.setColor(rgen.nextColor());
				oval.move(0, -ovalHeight);

			}
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
