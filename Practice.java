import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Practice extends GraphicsProgram {

	private GOval oval;

	private static final int V_MIN = 1;
	private static final int V_MAX = 5;

	private static final int RADISU_MIN = 10;
	private static final int RADIUS_MAX = 50;

	private int vx;
	private int vy;

	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {

		addMouseListeners();
		addRandomCircle();

		while (true) {
			
			if (oval.getX() < 0) {
				vx = -vx;
			}
			if (oval.getX() > getWidth() - oval.getWidth()) {
				vx = -vx;
			}

			if (oval.getY() < 0) {
				vy = -vy;
			}
			if (oval.getY() > getHeight() - oval.getHeight()) {
				vy = -vy;
			}

			oval.move(vx, vy);
			pause(50);
		}

	}

	private void addRandomCircle() {

		int R = rgen.nextInt(RADISU_MIN, RADIUS_MAX);

		oval = new GOval(R, R);
		oval.setFilled(true);
		oval.setColor(rgen.nextColor());

		int x = rgen.nextInt(0, getWidth() - 2 * R);
		int y = rgen.nextInt(0, getHeight() - 2 * R);
		add(oval, x, y);
	}

	public void mouseClicked(MouseEvent e) {
		GObject obj = getElementAt(e.getX(), e.getY());
		if (obj == oval) {
			oval.setColor(rgen.nextColor());
			vx = rgen.nextInt(V_MIN, V_MAX);
			vy = rgen.nextInt(V_MIN, V_MAX);

			if(rgen.nextBoolean(0.5)){
				vy = -vy;
			}
			if(rgen.nextBoolean(0.5)){
				vx = -vx;
			}
		}
	}
}