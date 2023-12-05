import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Problem42 extends GraphicsProgram {

	private static final int D = 100;
	private RandomGenerator rgen =  RandomGenerator.getInstance();
	
	GOval oval = new GOval (D, D);
	private static final int vx = 0;
	private static final int vy = 5;
	
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
		oval.move(vx, vy);
		pause(10);
	}

	public void mouseClicked (MouseEvent e){
		oval.setLocation(e.getX() - D / 2, e.getY() - D / 2);
		Color color1 = rgen.nextColor();
		oval.setColor(color1);

	}

}
