import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Practice extends GraphicsProgram {

	private RandomGenerator rgen = RandomGenerator.getInstance();

	private static final double MAX_R = 50;
	private static final double MIN_R = 10;

	private GOval oval;

	private static final double MIN_VX = 10;
	private static final double MAX_VX = 50;
	private static final double MIN_VY = 10;
	private static final double MAX_VY = 50;

	public void run() {
		addMouseListeners();
		addRandomCircle();
	}

	private void addRandomCircle(){

	double x = rgen.nextDouble(MIN_VX, MAX_VX);
	double y = rgen.nextDouble(MIN_VY, MAX_VY);

	double R = rgen.nextDouble(MIN_R, MAX_R);
	
	oval = new GOval(2 * R, 2 * R);
	oval.setFilled(true);
	oval.setColor(rgen.nextColor());
	
	add(oval, getWidth() / 2 - R, getHeight() / 2 - R);
	
	}
	
	public void mouseclicked(MouseEvent e){
		
	}
}