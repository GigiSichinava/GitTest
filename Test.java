
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
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private double startingX = BRICK_SEP;
	private double startingY = BRICK_Y_OFFSET;
	private static int counter = 0;
	GRect paddle = new GRect(PADDLE_WIDTH, PADDLE_HEIGHT);
	GOval ball = new GOval(2 * BALL_RADIUS, 2 * BALL_RADIUS);
	private static int xball;
	private static int yball;
	private double vx = rgen.nextDouble(1.0, 3.0);
	private double vy = 3.0;
	GLabel lost = new GLabel("You Lost");
	private GLabel won = new GLabel("You won");
	private static GObject collider;
	private static int attempts = NTURNS;
	
	/* Method: run() */
	/** Runs the Breakout program. */
	public void run() {
		addMouseListeners();
		addBricks();
		addPaddle();
		addBall();
	}

	// addBricks
	private void addBricks() {
		for (int rowNumber = 0; rowNumber < NBRICK_ROWS; rowNumber++) {
			for (int bricksNumber = 0; bricksNumber < NBRICKS_PER_ROW; bricksNumber++) {
				GRect rect = new GRect(startingX / 2 + (BRICK_WIDTH + BRICK_SEP) * bricksNumber,
						startingY + (BRICK_HEIGHT + BRICK_SEP) * rowNumber, BRICK_WIDTH, BRICK_HEIGHT);
				counter++;
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
		}
	}

	// Add Paddle
	private void addPaddle() {
		int paddleX = getWidth() / 2 - PADDLE_WIDTH / 2;
		int paddleY = getHeight() - PADDLE_Y_OFFSET;
		paddle.setLocation(paddleX, paddleY);
		paddle.setFilled(true);
		paddle.setColor(rgen.nextColor());
		add(paddle);
	}

	public void mouseMoved(MouseEvent e) {
		double X = e.getX();
		if (X >= PADDLE_WIDTH / 2) {
			if (X <= APPLICATION_WIDTH - PADDLE_WIDTH / 2) {
				paddle.setLocation(e.getX() - PADDLE_WIDTH / 2, getHeight() - PADDLE_Y_OFFSET);
			}
		}
	}

	// add ball and its movement
	private void addBall() {
		ball = new GOval(2 * BALL_RADIUS, 2 * BALL_RADIUS);
		ball.setFilled(true);
		ball.setColor(rgen.nextColor());
		add(ball, getWidth() / 2 - BALL_RADIUS, getHeight() / 2 - BALL_RADIUS);
		xball = WIDTH / 2;
		yball = HEIGHT / 2;
		if (rgen.nextBoolean(0.5))
			vx = -vx;
			vy = 3.0;

		while (counter > 0) {
			//update ball positions
			xball += vx;
			yball += vy;
			ball.move(vx, vy);
			pause(10);

			if (xball >= APPLICATION_WIDTH - BALL_RADIUS) {
				vx = -vx;
			}

			if (xball < BALL_RADIUS  ) {
				vx = -vx;
			}

			if (yball >= APPLICATION_HEIGHT - BALL_RADIUS) {
				attempts--;
				xball = APPLICATION_WIDTH / 2;
				
				if(attempts <= 0){
					remove(ball);
					lost.setLocation((APPLICATION_WIDTH / 2) - (lost.getWidth() / 2), APPLICATION_HEIGHT / 2);
					lost.setColor(Color.red);
					add(lost);
				} else {
					resetGame();
				}
			}

			if (yball < BALL_RADIUS) {
				vy = -vy;
			}

			ball.setLocation(xball - BALL_RADIUS, yball - BALL_RADIUS);
			collider = getCollidingObject();
			if (collider != null) {
				if (collider == paddle) {
					vy = -vy;
					if (xball <= paddle.getX() + paddle.getHeight())
						vx = -vx;
					if (xball >= paddle.getX() + paddle.getHeight() + (paddle.getWidth() / 2))
						vx = -vx;
				} else {
					vy = -vy;
					counter--;
					remove(collider);

				}
			}
		}
		if (counter == 0) {
			won.setLocation((APPLICATION_WIDTH / 2) - (won.getWidth() / 2), APPLICATION_HEIGHT / 2);
			won.setColor(Color.green);
			add(won);
		}
	}

	private void resetGame() {
		ball = new GOval(2 * BALL_RADIUS, 2 * BALL_RADIUS);
		ball.setFilled(true);
		ball.setColor(rgen.nextColor());
		add(ball, getWidth() / 2 - BALL_RADIUS, getHeight() / 2 - BALL_RADIUS);
		if (rgen.nextBoolean(0.5))
			vx = -vx;
			vy = 3.0;
	}

	// check 4 corners around balls rectangle
	private GObject getCollidingObject() {
		collider = getElementAt(xball - BALL_RADIUS, yball - BALL_RADIUS);
		if (collider == null)
			collider = getElementAt(xball - BALL_RADIUS, yball + BALL_RADIUS);
		if (collider == null)
			collider = getElementAt(xball + BALL_RADIUS, yball + BALL_RADIUS);
		if (collider == null)
			collider = getElementAt(xball + BALL_RADIUS, yball - BALL_RADIUS);
		return collider;
	}

}
