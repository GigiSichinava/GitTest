import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class FinalsProblem10 extends GraphicsProgram {

	private static final int N_ROWS = 8;
	private static final int N_COLS = 8;

	public void init() {
		setSize(600, 600);
		JLabel label = new JLabel("Move");
		add(label, SOUTH);
		JTextField textField = new JTextField(10);
		add(textField, SOUTH);
		textField.addActionListener(this);

		addActionListeners();
	}

	public void run() {
		for (int i = 0; i < N_ROWS; i++) {
			for (int j = 0; j < N_COLS; j++) {
				int rectWidth = getWidth() / N_COLS;
				int rectHeight = getHeight() / N_ROWS;
				GRect rect = new GRect(rectWidth, rectHeight);
				add(rect, j * rectWidth, i * rectHeight);
			}
		}
		
		int ovalWidth = getWidth() / N_COLS;
		int ovalHeight = getHeight() / N_ROWS;
		GOval oval = new GOval(ovalWidth, ovalHeight);
		oval.setFilled(true);
		oval.setColor(Color.RED);
		add(oval, 4 * ovalWidth, 4 * ovalHeight);
		
		double stoneWidth = (getWidth() / N_COLS) * 0.7;
		double stoneHeight = (getHeight() / N_ROWS) * 0.7;
		GRect stone = new GRect(stoneWidth, stoneHeight);
		stone.setFilled(true);
		stone.setColor(Color.GREEN);
		add(stone, 4 * ovalWidth + 10, 4 * ovalHeight + 10);
		
	}

}
