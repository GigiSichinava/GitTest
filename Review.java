import javax.swing.JButton;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class Review extends GraphicsProgram{
	
	private static final int ROW_NUM = 5;
	private static final int COL_NUM = 5;

	
	public void init(){
		JButton down = new JButton ("Move down");
		add(down, SOUTH);
		JButton up = new JButton ("Move up");
		add(up, NORTH);
		JButton right = new JButton ("Move right");
		add(right, EAST);
		JButton left = new JButton ("Move left");
		add(left, WEST);
	}
	
	public void run(){
		
	}
}