import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class random extends GraphicsProgram {

	private final int PAUSE = 50;
	private final int D = 50;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private final double x = 5.0;
	private final double y = 0.0;
	private final double GRAVITY = 0.7;

	private double dy = x;
	private double dx = y;
	private GOval ball;

	public void run() {
		setup();
		while (ball.getX() < getWidth()) {
			moveBall();
			checkBall();
			pause(PAUSE);
		}
	}

	private void setup() {
		GOval ball = new GOval(D, D);
		ball.setFilled(true);
		add(ball, D / 2, 100);
	}

	private void moveBall() {
		dy += GRAVITY;
		ball.move(dx, dy);
	}

	private void checkBall() {
		if (ball.getY() > getHeight() - D) {
			dy = -dy * GRAVITY;
			double diff = ball.getY() - (getHeight() - D);
			ball.move(0, -2 * diff);
		}
	}
}
