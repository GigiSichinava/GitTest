import javax.swing.JButton;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Review extends GraphicsProgram{
	
	private static final int NUM_ROWS = 5;
	private static final int NUM_COLS = 5;
	private GOval oval;
	
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
				GRect rect = new GRect(width, height);
				add(rect, i * width, j * height);
			}
		}
		int ovalHeight = height;
		int ovalWidth = width;
		oval = new GOval(ovalWidth, ovalHeight);
		add(oval, getWidth() / 2 - ovalWidth / 2, getHeight() / 2 - ovalHeight / 2);
	}
}