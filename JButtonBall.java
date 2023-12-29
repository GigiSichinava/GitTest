
import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.JButton;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

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
				rect.setFillColor(Color.white);
				add(rect, i * width, j * height);
			}
		}
		ovalHeight = height;
		ovalWidth = width;
		oval = new GOval(ovalWidth, ovalHeight);
		oval.setFilled(true);
		oval.setFillColor(Color.GREEN);
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
}