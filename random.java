import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class random extends GraphicsProgram {

	private final int PAUSE = 30;
	private final int D = 100;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private final int x = 10;
	private final int y = 10;

	public void run() {

		GOval oval = new GOval(D, D);
		add(oval, 0, 0);
		int dx = x;
		int dy = y;

		while (true) {
			oval.move(dx, dy);
			pause(PAUSE);

			if (oval.getY() >= getHeight() - D) {
				dy = -dy;
				break;
			}

			if (oval.getX() >= getWidth() - D) {
				dx = -dx;
			}

			if (oval.getY() <= 0) {
				dy = -dy;
			}

			if (oval.getX() <= 0) {
				dx = -dx;
			}
		}
	}
}
