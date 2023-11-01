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
		double startingX = getWidth() / 2 - BRICKS_IN_BASE * BRICK_WIDTH / 2;
		double startingY = getHeight() - BRICK_HEIGHT;

		for(int i = 0; i < BRICKS_IN_BASE; i++){
		GRect rect = new GRect (startingX + BRICK_WIDTH * BRICKS_IN_BASE, startingY, BRICK_WIDTH, BRICK_HEIGHT);
		add(rect);
		}

	}
}