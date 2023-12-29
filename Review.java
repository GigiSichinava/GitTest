import javax.swing.JButton;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Review extends GraphicsProgram{
	
	private static final int NUM_ROWS = 8;
	private static final int NUM_COLS = 10;
	
	
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
		
		int height = getHeight() / NUM_ROWS;
		int width = getWidth() / NUM_COLS;
		for(int i = 0; i < NUM_ROWS; i++){
			for(int j = 0; j < NUM_COLS; j++){
				GRect rect = new GRect(height, width);
				add(rect, i + height, j + width);
			}
		}
	}
}