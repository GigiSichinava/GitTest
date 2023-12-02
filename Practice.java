import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Practice extends GraphicsProgram {

	private RandomGenerator rgen = RandomGenerator.getInstance();

	private static final double MAX_R = 50;
	private static final double MIN_R = 10;

	private GOval oval;

	private static final double MIN_VX = 1;
	private static final double MAX_VX = 5;
	private static final double MIN_VY = 1;
	private static final double MAX_VY = 5;

	public void run() {
		addMouseListeners();
		addRandomCircle();

		double vx = rgen.nextDouble(MIN_VX, MAX_VX);
		double vy = rgen.nextDouble(MIN_VY, MAX_VY);

		while (true) {
			oval.move(vx, vy);
			pause(100);
		}
	}

	private void addRandomCircle() {

		double R = rgen.nextDouble(MIN_R, MAX_R);

		oval = new GOval(2 * R, 2 * R);
		oval.setFilled(true);
		oval.setColor(rgen.nextColor());

		double randomX = rgen.nextDouble(0, getWidth() - oval.getWidth());
		double randomY = rgen.nextDouble(0, getHeight() - oval.getHeight());

		add(oval, randomX, randomY);

	}

	public void mouseClicked(MouseEvent e) {

		GObject obj = getElementAt(e.getX(), e.getY());
		if (obj == oval) {
			oval.setColor(rgen.nextColor());
		}
	}
}