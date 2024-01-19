import javax.swing.JButton;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class FinalsProblem004 extends GraphicsProgram{
	
	private JButton buttonUp;
	private JButton buttonDown;
	
	private static final int D = 50;
	
	private GOval redOval;
	private GOval blueOval;
	
	public void init(){
		
		buttonUp = new JButton("Up");
		add(buttonUp, SOUTH);
		
		buttonDown = new JButton("Down");
		add(buttonDown, SOUTH);
		
		redOval = new GOval(D, D, 10, 10);
		add(redOval);
		
	}
}
