import javax.swing.JButton;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Review extends GraphicsProgram{
	
	private static final int NUM_ROWS = 5;
	private static final int NUM_COLS = 5;
	
	
	public void init(){
		JButton right = new JButton("Move right");
		add(right, EAST);
		JButton left = new JButton("Move left");
		add(left, WEST);
		JButton down = new JButton("Move down");
		add(down, SOUTH);
		JButton up = new JButton("Move up");
		add(up, NORTH);
	}
	
	public void run(){
		
		double height = (double)getHeight() / NUM_ROWS;
		double width = (double)getWidth() / NUM_COLS;
		for(int i = 0; i < NUM_ROWS; i++){
			for(int j = 0; j < NUM_COLS; j++){
				GRect rect = new GRect(width, height);
				add(rect, i * width, j * height);
			}
		}
	}
}