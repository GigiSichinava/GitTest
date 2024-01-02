import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Review extends GraphicsProgram {

	private static final int NUM = 100;
	private static final int R = 5;
	private static final int DELAY = 50;

	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		GOval[] snowflakes = new GOval[NUM];

		for (int i = 0; i < NUM; i++) {
			snowflakes[i] = new GOval(R, R);
			snowflakes[i].setFilled(true);
			int startX = rgen.nextInt(0, getWidth() - R);
			int startY = rgen.nextInt(0, getHeight() - R);
			snowflakes[i].setLocation(startX, startY);
			add(snowflakes[i]);
		}

		while (true) {
			for (int i = 0; i < NUM; i++) {
				snowflakes[i].move(0, rgen.nextInt(1, 5));

				if (snowflakes[i].getY() > getHeight()) {
					snowflakes[i].setLocation(rgen.nextInt(0, getWidth() - R), -R);
				}
			}
			pause(DELAY);
		}
	}
}
