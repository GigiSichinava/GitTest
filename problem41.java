import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class problem41 extends GraphicsProgram {

	private final int PAUSE = 30;
	private final int D = 100;
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {

		GOval oval = new GOval(D, D);
		add(oval, 0, getHeight() / 2 - D / 2);
		Color color = rgen.nextColor();
		oval.setColor(color);
		
//		while (true) {

			while (oval.getX() <= getWidth() - D) {
				pause(PAUSE);
				oval.move(10, 0);
				oval.setFilled(true);
			}
			oval.setColor(color);

			while (oval.getX() >= 0) {
				pause(PAUSE);
				oval.move(-10, 0);
				oval.setFilled(true);
			}
			oval.setColor(color);
//		}

	}
}
