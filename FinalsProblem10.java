import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class FinalsProblem10 extends GraphicsProgram {

	private static final int N_ROWS = 8;
	private static final int N_COLS = 8;
	
	int Width = getHeight() / N_COLS;
	int Height = getHeight() / N_ROWS;
	
	private JTextField textField;
	private GOval oval;

	public void init() {
		JLabel label = new JLabel("Move");
		add(label, SOUTH);
		textField = new JTextField(10);
		add(textField, SOUTH);
		textField.addActionListener(this);

		addActionListeners();
	}

	public void run() {
		
		
		for (int i = 0; i < N_ROWS; i++) {
			for (int j = 0; j < N_COLS; j++) {
				int rectWidth = getHeight() / N_COLS;
				int rectHeight = getHeight() / N_ROWS;
				GRect rect = new GRect(rectWidth, rectHeight);
				add(rect, j * rectWidth, i * rectHeight);
			}
		}
		
		int ovalWidth = getHeight() / N_COLS;
		int ovalHeight = getHeight() / N_ROWS;
		oval = new GOval(ovalWidth, ovalHeight);
		oval.setFilled(true);
		oval.setColor(Color.RED);
		add(oval, 4 * ovalWidth, 4 * ovalHeight);
		
		/*
		double stoneWidth = (getWidth() / N_COLS) * 0.7;
		double stoneHeight = (getHeight() / N_ROWS) * 0.7;
		GRect stone = new GRect(stoneWidth, stoneHeight);
		stone.setFilled(true);
		stone.setColor(Color.GREEN);
		add(stone, 4 * ovalWidth + 10, 4 * ovalHeight + 10);
		*/
	}
	
	public void actionPerformed(ActionEvent e){
		int Width = getHeight() / N_COLS;
		int Height = getHeight() / N_ROWS;
		
		
		String line = e.getActionCommand();
		if(line.equals("right")){
			oval.move(Width, 0);
		}
		if(line.equals("left")){
			oval.move(-Width, 0);
		}
		if(line.equals("up")){
			oval.move(0, Height);
		}
		if(line.equals("down")){
			oval.move(0, -Height);
		}
	}

}
