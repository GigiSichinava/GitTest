import javax.swing.JButton;

import acm.program.GraphicsProgram;

public class Review extends GraphicsProgram{
	
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
		
	}
}