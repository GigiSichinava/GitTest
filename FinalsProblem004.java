import javax.swing.JButton;

import acm.program.GraphicsProgram;

public class FinalsProblem004 extends GraphicsProgram{
	public void init(){
		
		JButton buttonUp = new JButton("Up");
		add(buttonUp, SOUTH);
		
		JButton buttonDown = new JButton("Down");
		add(buttonDown, SOUTH);
		
	}
}
