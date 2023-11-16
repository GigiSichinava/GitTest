
/*
 * File: Breakout.java
 * -------------------
 * Name:
 * Section Leader:
 * 
 * This file will eventually implement the game of Breakout.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Test extends GraphicsProgram {

	/** Width and height of application window in pixels */
	public static final int APPLICATION_WIDTH = 400;
	public static final int APPLICATION_HEIGHT = 600;

	/** Dimensions of game board (usually the same) */
	private static final int WIDTH = APPLICATION_WIDTH;
	private static final int HEIGHT = APPLICATION_HEIGHT;

	/** Dimensions of the paddle */
	private static final int PADDLE_WIDTH = 60;
	private static final int PADDLE_HEIGHT = 10;

	/** Offset of the paddle up from the bottom */
	private static final int PADDLE_Y_OFFSET = 30;

	/** Number of bricks per row */
	private static final int NBRICKS_PER_ROW = 10;

	/** Number of rows of bricks */
	private static final int NBRICK_ROWS = 10;

	/** Separation between bricks */
	private static final int BRICK_SEP = 4;

	/** Width of a brick */
	private static final int BRICK_WIDTH = (WIDTH - (NBRICKS_PER_ROW - 1) * BRICK_SEP) / NBRICKS_PER_ROW;

	/** Height of a brick */
	private static final int BRICK_HEIGHT = 8;

	/** Radius of the ball in pixels */
	private static final int BALL_RADIUS = 10;

	/** Offset of the top brick row from the top */
	private static final int BRICK_Y_OFFSET = 70;

	/** Number of turns */
	private static final int NTURNS = 3;

	// **Privates that we made */
	private static int counter = 0;

	/* Method: run() */
	/** Runs the Breakout program. */
	public void run() {
		applicationSize();
		addBricks();

	}

	private void applicationSize() {
		setSize(APPLICATION_WIDTH, APPLICATION_HEIGHT);
	}

	double startingX = BRICK_SEP ;
	double startingY = BRICK_Y_OFFSET;

	private void addBricks() {
		for (int rowNumber = 0; rowNumber < NBRICK_ROWS; rowNumber++) {
			for (int bricksNumber = 0; bricksNumber < NBRICKS_PER_ROW; bricksNumber++) {
				GRect rect = new GRect(startingX + (BRICK_WIDTH + BRICK_SEP) * bricksNumber,
						startingY + BRICK_HEIGHT * rowNumber, BRICK_WIDTH, BRICK_HEIGHT);
				counter++;
				rect.setFilled(false);
				add(rect);
				if (rowNumber < 2) {
					rect.setFilled(true);
					rect.setColor(Color.RED);
				}
				if (rowNumber < 4 && rowNumber > 1) {
					rect.setFilled(true);
					rect.setColor(Color.ORANGE);
				}
				if (rowNumber < 6 && rowNumber > 3) {
					rect.setFilled(true);
					rect.setColor(Color.YELLOW);
				}
				if (rowNumber < 8 && rowNumber > 5) {
					rect.setFilled(true);
					rect.setColor(Color.GREEN);
				}
				if (rowNumber < 10 && rowNumber > 7) {
					rect.setFilled(true);
					rect.setColor(Color.CYAN);
				}
			}
			startingY = startingY + BRICK_SEP;
		}

	}

}
