import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Practice extends GraphicsProgram {

	private RandomGenerator rgen = RandomGenerator.getInstance();

	private static final double PAUSE = 50;
	private static final double R = 30;
	private static final double D = 2 * R;
	private GOval ball;

	public void run() {
		addMouseListeners();
		addBall1();
		addBall2();
		double dx = 10;
		double dy = 10;
		while (true) {

			if (ball.getX() + D > getWidth()) {
				dx = -dx;
				ball.setColor(rgen.nextColor());
			}
			if (ball.getY() + D > getHeight()) {
				dy = -dy;
				ball.setColor(rgen.nextColor());
			}
			if (ball.getX() < 0) {
				dx = -dx;
				ball.setColor(rgen.nextColor());
			}
			if (ball.getY() < 0) {
				dy = -dy;
				ball.setColor(rgen.nextColor());
			}
			ball.move(dx, dy);
			pause(PAUSE);

		}
	}

	private void addBall1() {
		ball = new GOval(2 * R, 2 * R);
		ball.setFilled(true);
		ball.setColor(rgen.nextColor());
		add(ball, 0, 0);
	}
	private void addBall2(){
		ball = new GOval(2 * R, 2 * R);
		ball.setFilled(true);
		ball.setColor(rgen.nextColor());
		add(ball, getWidth() - D, getHeight() - D);
	}

	public void mouseClicked(MouseEvent e) {
		GObject obj = getElementAt(e.getX(), e.getY());
		if (obj == null) {
			ball.setColor(rgen.nextColor());
		}
		if (obj == ball) {
			remove(ball);
		}

	}
}