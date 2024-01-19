import javax.swing.JButton;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class FinalsProblem004 extends GraphicsProgram{
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	private JButton buttonUp;
	private JButton buttonDown;
	
	private static final int R = 50;
	
	private GOval redOval;
	private GOval blueOval;
	
	public void init(){
		
		buttonUp = new JButton("Up");
		add(buttonUp, SOUTH);
		
		buttonDown = new JButton("Down");
		add(buttonDown, SOUTH);
		
		redOval = new GOval(rgen.nextInt(0, getWidth() - 2 * R), rgen.nextInt(0, getHeight() - 2 * R), 2 * R, 2 * R);
		add(redOval);
		
		
	}
}
