import acm.program.GraphicsProgram;
import acm.graphics.*;
import acm.program.*;

public class Practice extends GraphicsProgram {

	/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

	/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

	/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;

	private double startingX = 0;
	private double startingY = 0;
	private int bricksLeft = BRICKS_IN_BASE;

	public void run() {
		double startingX = getWidth() / 2 - BRICKS_IN_BASE / 2 * BRICK_WIDTH;
		double startingY = getHeight() - BRICK_HEIGHT;

		for (int r = 0; r < BRICKS_IN_BASE; r++) {
			for (int c = 0; c < BRICKS_IN_BASE; c++) {
				GRect rect = new GRect(startingX + BRICK_WIDTH * c, startingY - (r * BRICK_HEIGHT), BRICK_WIDTH, BRICK_HEIGHT);
				add(rect);
			}
			bricksLeft = bricksLeft - 1;
			startingX = getWidth() / 2 - (bricksLeft * BRICK_WIDTH) / 2;

		}
	}
}