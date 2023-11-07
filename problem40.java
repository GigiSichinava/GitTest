import java.awt.Color;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class problem40 extends GraphicsProgram {

	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int PAUSE = 10;
	private static final int D = 100;

	public void run() {

		GOval oval = new GOval(D, D);
		add(oval);
		oval.setLocation(0, 0);

	
		Color color = rgen.nextColor();
		while (oval.getY() <= getHeight() - D) {
			pause(PAUSE);
			oval.move(10, 10);
			oval.setFilled(true);
			oval.setColor(color);
		}

		Color color1 = rgen.nextColor();
		while (oval.getX() <= getWidth() - D) {
			pause(PAUSE);
			oval.move(10, -10);
			oval.setFilled(true);
			oval.setColor(color1);
		}

		Color color3 = rgen.nextColor();
		while (oval.getY() >= 0 ) {
			pause(PAUSE);
			oval.move(-10, -10);
			oval.setFilled(true);
			oval.setColor(color3);
		}

		Color color4 = rgen.nextColor();
		while (oval.getY() <=  getHeight() - D ) {
			pause(PAUSE);
			oval.move(-10, 10);
			oval.setFilled(true);
			oval.setColor(color4);
	
		}
		Color color5 = rgen.nextColor();
		while (oval.getX() > 0){
			pause(PAUSE);
			oval.move(- 10, -10);
			oval.setFilled(true);
			oval.setColor(color5);
		}
	
		oval.setFilled(false);
		oval.setFilled(true);
		oval.setColor(Color.BLACK);
		add(oval);
	}
	
	
	
}

