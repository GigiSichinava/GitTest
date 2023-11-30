import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;



public class Practice extends GraphicsProgram {
	
	private GOval oval;
	
	private static final int V_MIN = 1;
	private static final int V_MAX = 5;

	private static final int RADISU_MIN = 10;
	private static final int RADIUS_MAX = 50;
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {

		addMouseListeners();
		addRandomCircle();

	}
	
	private void addRandomCircle(){
		
		int  R = rgen.nextInt(RADISU_MIN, RADIUS_MAX);
		
		oval = new GOval (R, R);
		oval.setFilled(true);
		oval.setColor(rgen.nextColor());
		add(oval, getWidth() / 2 - R, getHeight() / 2 - R);
		
		
	}
}