import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class problem42 extends GraphicsProgram {

	private static final int D = 30;
	private RandomGenerator rgen =  RandomGenerator.getInstance();
	
	GOval oval = new GOval (D, D);
	public void run() {
		addMouseListeners();
		createBall();
	}

	private void createBall() {
		int x = rgen.nextInt(0, getWidth());
		int y = rgen.nextInt(0, getHeight());
		
		oval.setFilled(true);
		add(oval, x, y);
	}

	public void mouseClicked (MouseEvent e){
		oval.setLocation(e.getX(), e.getY());
	}

}
