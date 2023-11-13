import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class problem42 extends GraphicsProgram {

	private static final int D = 100;
	private RandomGenerator rgen =  RandomGenerator.getInstance();
	
	GOval oval = new GOval (D, D);
	public void run() {
		addMouseListeners();
		createBall();
	}

	private void createBall() {
		int x = rgen.nextInt(0, getWidth() - D / 2);
		int y = rgen.nextInt(0, getHeight() - D / 2);
		
		oval.setFilled(true);
		Color color = rgen.nextColor();
		oval.setColor(color);
		add(oval, x, y);
	}

	public void mouseClicked (MouseEvent e){
		oval.setLocation(e.getX() - D / 2, e.getY() - D / 2);
	}

}
