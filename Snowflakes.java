import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Snowflakes extends GraphicsProgram {

	private static final int NUM_FLAKES = 50;
	private static final int FLAKES_R = 5;
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {

		GOval[] snowFlakes = new GOval[NUM_FLAKES];

		for (int i = 0; i < NUM_FLAKES; i++) {
			snowFlakes[i] = new GOval(FLAKES_R, FLAKES_R);
			snowFlakes[i].setFilled(true);
			int x = rgen.nextInt(0, getWidth() - (2 * FLAKES_R));
			int y = rgen.nextInt(-FLAKES_R, getHeight() - (2 * FLAKES_R));
			snowFlakes[i].setLocation(x, y);
			add(snowFlakes[i]);
		}

		while (true) {
			for (int j = 0; j < NUM_FLAKES; j++) {
				snowFlakes[j].move(0, rgen.nextInt(1, 5));
				pause(100);
				if (snowFlakes[j].getY() > getHeight()) {
					snowFlakes[j].setLocation(rgen.nextInt(0, getWidth() - (2 * FLAKES_R)),
							rgen.nextInt(-FLAKES_R, getHeight() - (2 * FLAKES_R)));
				}
			}
		}
	}
}
