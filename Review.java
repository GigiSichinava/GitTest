import javax.swing.JButton;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class Review extends GraphicsProgram{
	
	public void init(){
		JButton down = new JButton ("Move down");
		add(down, SOUTH);
		JButton up = new JButton ("Move up");
		add(up, NORTH);
	}
	
	public void run(){
	
	}
}