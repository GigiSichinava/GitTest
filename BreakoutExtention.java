
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

public class BreakoutExtention extends GraphicsProgram {

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
		// create rectangles and count their number in 'counter'
		for (int rowNumber = 0; rowNumber < NBRICK_ROWS; rowNumber++) {
			for (int bricksNumber = 0; bricksNumber < NBRICKS_PER_ROW; bricksNumber++) {
				GRect rect = new GRect(startingX / 2 + (BRICK_WIDTH + BRICK_SEP) * bricksNumber,
						startingY + (BRICK_HEIGHT + BRICK_SEP) * rowNumber, BRICK_WIDTH, BRICK_HEIGHT);
				counter++;
				add(rect);

				// define colors of bricks
				// paint 1 & 2 rows in red
				if (rowNumber < 2) {
					rect.setFilled(true);
					rect.setColor(Color.RED);
				}
				// paint 3 & 4 rows in orange
				if (rowNumber < 4 && rowNumber > 1) {
					rect.setFilled(true);
					rect.setColor(Color.ORANGE);
				}
				// paint 5 & 6 rows in yellow
				if (rowNumber < 6 && rowNumber > 3) {
					rect.setFilled(true);
					rect.setColor(Color.YELLOW);
				}
				// paint 7 & 8 rows in green
				if (rowNumber < 8 && rowNumber > 5) {
					rect.setFilled(true);
					rect.setColor(Color.GREEN);
				}
				// paint 9 & 10 rows in red
				if (rowNumber < 10 && rowNumber > 7) {
					rect.setFilled(true);
					rect.setColor(Color.CYAN);
				}
			}
		}
	}

	// add Paddle
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
		// make paddle to not cross right and left side of canvas
		if (X >= PADDLE_WIDTH / 2) {
			if (X <= APPLICATION_WIDTH - PADDLE_WIDTH / 2) {
				paddle.setLocation(e.getX() - PADDLE_WIDTH / 2, getHeight() - PADDLE_Y_OFFSET);
			}
		}
	}

	// add ball and movement
	private void addBall() {
		// create ball
		ball = new GOval(2 * BALL_RADIUS, 2 * BALL_RADIUS);
		ball.setFilled(true);
		ball.setColor(rgen.nextColor());
		add(ball, getWidth() / 2 - BALL_RADIUS, getHeight() / 2 - BALL_RADIUS);
		xball = WIDTH / 2;
		yball = HEIGHT / 2;
		// randomly generate ball's starting direction
		if (rgen.nextBoolean(0.5))
			vx = -vx;

		// define ball's movement
		while (counter > 0) {
			// update ball positions
			xball += vx;
			yball += vy;
			ball.move(vx, vy);
			pause(10);

			// check right side
			if (ball.getX() >= APPLICATION_WIDTH - BALL_RADIUS * 2) {
				vx = -vx;
			}

			// check left side
			if (ball.getX() <= 0) {
				vx = -vx;
			}

			// check bottom side
			// and if ball passes through -1 attempt
			if (ball.getY() >= APPLICATION_HEIGHT - BALL_RADIUS * 2) {
				attempts--;
				// finish game after all used attempts
				if (attempts <= 0) {
					remove(ball);
					// add text that says we have lost
					lost.setLocation((APPLICATION_WIDTH / 2) - (lost.getWidth() / 2), APPLICATION_HEIGHT / 2);
					lost.setColor(Color.red);
					add(lost);
				} else {
					// reset game after new attempt
					resetGame();
				}
			}

			// check top side
			if (ball.getY() <= 0) {
				vy = -vy;
			}

			// check when ball touches the paddle
			ball.setLocation(xball - BALL_RADIUS, yball - BALL_RADIUS);
			collider = getCollidingObject();
			if (collider != null) {
				// when touching object is paddle
				if (collider == paddle) {
					vy = -vy;
				} else {
					// when touching object is brick
					vy = -vy;
					// -1 brick in counter
					// remove brick
					counter--;
					remove(collider);

				}
			}
		}
		// if all bricks are gone, we have won the game
		if (counter == 0) {
			// add text that says we have won
			won.setLocation((APPLICATION_WIDTH / 2) - (won.getWidth() / 2), APPLICATION_HEIGHT / 2);
			won.setColor(Color.green);
			add(won);
		}
	}

	// reset the game after ball passes a bottom border
	private void resetGame() {
		ball = new GOval(2 * BALL_RADIUS, 2 * BALL_RADIUS);
		ball.setFilled(true);
		ball.setColor(rgen.nextColor());
		add(ball, getWidth() / 2 - BALL_RADIUS, getHeight() / 2 - BALL_RADIUS);
		xball = WIDTH / 2;
		yball = HEIGHT / 2;
	}

	// check 4 corners around ball's rectangle
	// remember objects in 'collider' with getElementAt method
	private GObject getCollidingObject() {
		 collider = getElementAt(ball.getX(), ball.getY());
		 if (collider == null)
		 collider = getElementAt(ball.getX(), ball.getY() + 2 * BALL_RADIUS);
		 if (collider == null)
		 collider = getElementAt(ball.getY() + 2 * BALL_RADIUS, BALL_RADIUS);
		 if (collider == null)
		 collider = getElementAt(ball.getX() + 2 * BALL_RADIUS, ball.getY());

		collider = getElementAt(ball.getX() - 1, ball.getY() + BALL_RADIUS); // 1
		if (collider == null)
			collider = getElementAt(ball.getX() + BALL_RADIUS, ball.getY() + 2 * BALL_RADIUS + 1); // 4
		if (collider == null)
			collider = getElementAt(ball.getX() + 2 * BALL_RADIUS + 1, ball.getY() + BALL_RADIUS); // 3
		if (collider == null)
			collider = getElementAt(ball.getX() + BALL_RADIUS, ball.getY() - 1); // 2
		return collider;
	}

}
