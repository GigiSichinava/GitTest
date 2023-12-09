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
	private GOval ball1;
	private GOval ball2;

	public void run() {
		addMouseListeners();
		addBall1();
		addBall2();
		double dx = 10;
		double dy = 10;
		while (true) {

			if (ball1.getX() + D > getWidth()) {
				dx = -dx;
				ball1.setColor(rgen.nextColor());
			}
			if (ball1.getY() + D > getHeight()) {
				dy = -dy;
				ball1.setColor(rgen.nextColor());
			}
			if (ball1.getX() < 0) {
				dx = -dx;
				ball1.setColor(rgen.nextColor());
			}
			if (ball1.getY() < 0) {
				dy = -dy;
				ball.setColor(rgen.nextColor());
			}
			ball.move(dx, dy);
			pause(PAUSE);

		}
	}

	private void addBall1() {
		ball1 = new GOval(2 * R, 2 * R);
		ball1.setFilled(true);
		ball1.setColor(rgen.nextColor());
		add(ball1, 0, 0);
	}
	private void addBall2(){
		ball2 = new GOval(2 * R, 2 * R);
		ball2.setFilled(true);
		ball2.setColor(rgen.nextColor());
		add(ball2, getWidth() - D, getHeight() - D);
	}

	public void mouseClicked(MouseEvent e) {
		GObject obj = getElementAt(e.getX(), e.getY());
		if (obj == null) {
			ball1.setColor(rgen.nextColor());
		}
		if (obj == ball1) {
			remove(ball1);
		}

	}
}