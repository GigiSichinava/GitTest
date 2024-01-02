import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Snowflakes extends GraphicsProgram {

	private static final int NUM = 200;
	private static final int D = 5;
	private static final int DELAY = 50;

	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		GOval[] snowFlakes = new GOval[NUM];

		for (int i = 0; i < NUM; i++) {
			snowFlakes[i] = new GOval(D, D);
			snowFlakes[i].setFilled(true);
			snowFlakes[i].setColor(Color.BLUE);
			int startX = rgen.nextInt(0, getWidth() - D);
			int startY = rgen.nextInt(0, getHeight() - D);
			snowFlakes[i].setLocation(startX, startY);
			add(snowFlakes[i]);
		}

		while (true) {
			for (int i = 0; i < NUM; i++) {
				snowFlakes[i].move(0, rgen.nextInt(1, 5));

				if (snowFlakes[i].getY() > getHeight()) {
					snowFlakes[i].setLocation(rgen.nextInt(0, getWidth() - D), -D);
				}
			}
			pause(DELAY);
		}
	}
}
