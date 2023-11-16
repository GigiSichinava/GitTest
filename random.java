
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
import java.awt.font.*;

public class random extends GraphicsProgram {

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
	private static final int BRICK_WIDTH = (WIDTH - ((NBRICKS_PER_ROW - 1) * BRICK_SEP)) / NBRICKS_PER_ROW;

	/** Height of a brick */
	private static final int BRICK_HEIGHT = 8;

	/** Radius of the ball in pixels */
	private static final int BALL_RADIUS = 10;

	/** Offset of the top brick row from the top */
	private static final int BRICK_Y_OFFSET = 70;

	/** Number of turns */
	private static final int NTURNS = 3;

	/** Privates that we made */
	private static GRect paddle;
	private GLabel won = new GLabel("You won");
	private GLabel lost = new GLabel("You Lost");
	private static int counter = 0;
	private static GObject collider;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private double vx, vy;
	private static GOval ball;
	private static int xball;
	private static int yball;

	public void run() {
		setSize(APPLICATION_WIDTH, APPLICATION_HEIGHT);
		setupGame();
		paddle = new GRect(0, APPLICATION_HEIGHT - 3 * PADDLE_Y_OFFSET, PADDLE_WIDTH, PADDLE_HEIGHT);
		paddle.setFilled(true);
		paddle.setColor(rgen.nextColor());
		addMouseListeners();
		add(paddle);
		ball = new GOval(2 * BALL_RADIUS, 2 * BALL_RADIUS);
		ball.setFilled(true);
		ball.setColor(rgen.nextColor());
		add(ball);
		ballMovement();
	}

	public void mouseMoved(MouseEvent e) {
		double X = e.getX();
		if (X >= PADDLE_WIDTH / 2) {
			if (X < APPLICATION_WIDTH - PADDLE_WIDTH / 2) {
				paddle.setLocation(X - PADDLE_WIDTH / 2,
						APPLICATION_HEIGHT - PADDLE_HEIGHT - (double) (2.4 * PADDLE_Y_OFFSET));
			}
		}
	}

	private void setupGame() {
		double x = BRICK_SEP;
		int y = BRICK_Y_OFFSET;

		for (int i = 0; i < NBRICK_ROWS; i++) {

			for (int j = 0; j < NBRICKS_PER_ROW; j++) {
				GRect brick = new GRect(x + (double) (j * (BRICK_SEP + BRICK_WIDTH)),y + i * (BRICK_HEIGHT + BRICK_SEP), BRICK_WIDTH, BRICK_HEIGHT);						
				counter++;
				switch (i / 2) {

				case 0:
					brick.setColor(Color.RED);
					brick.setFilled(true);
					break;
				case 1:
					brick.setColor(Color.ORANGE);
					brick.setFilled(true);
					break;
				case 2:
					brick.setColor(Color.YELLOW);
					brick.setFilled(true);
					break;
				case 3:
					brick.setColor(Color.GREEN);
					brick.setFilled(true);
					break;
				case 4:
					brick.setColor(Color.CYAN);
					brick.setFilled(true);
					break;
				}

				add(brick);

			}
		}

	}

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

	private void ballMovement() {
		xball = APPLICATION_WIDTH / 2;
		yball = APPLICATION_HEIGHT / 2;
		vx = rgen.nextDouble(1.0, 3.0);
		if (rgen.nextBoolean(0.5))
			vx = -vx;
			vy = 3.0;

		while (counter > 0) {
			xball += vx;
			yball += vy;
			pause(10);
			
			if (xball >= APPLICATION_WIDTH - BALL_RADIUS) {
				vx = -vx;
			}
			if (xball < BALL_RADIUS / 20) {
				vx = -vx;
			}

			if (yball >= APPLICATION_HEIGHT - BALL_RADIUS) {
				xball = APPLICATION_WIDTH / 2;
				remove(ball);
				lost.setLocation((APPLICATION_WIDTH / 2) - (lost.getWidth() / 2), APPLICATION_HEIGHT / 2);
				lost.setColor(Color.red);
				add(lost);
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

}
