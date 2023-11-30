import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Practice extends GraphicsProgram {

	private GOval oval;

	private static final int VXMAX = 20;
	private static final int VXMIN = 10;

	private static final int VYMAX = 20;
	private static final int VYMIN = 10;

	private static final int MAX_RADIUS = 50;
	private static final int MIN_RADIUS = 10;

	private int vx = 0;
	private int vy = 0;

	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {

		addMouseListeners();
		addRandomCircle();

		while (true) {
			oval.move(vx, vy);
			pause(1000);

		}
	}

	private void addRandomCircle() {
		int R = rgen.nextInt(MIN_RADIUS, MAX_RADIUS);

		oval = new GOval(2 * R, 2 * R);
		oval.setFilled(true);
		oval.setColor(rgen.nextColor());
		add(oval, getWidth() / 2 - R, getHeight() / 2 - R);
	}

	public void mouseClicked(MouseEvent e) {
		GObject obj = getElementAt(e.getX(), e.getY());
		if (obj == oval) {
			oval.setColor(rgen.nextColor());

			vx = rgen.nextInt(VXMIN, VXMAX);
			if(rgen.nextBoolean(0.5)){
				vx = -vx;
			}
			if(rgen.nextBoolean(0.5)){
				vy = -vy;
				
			}
			vy = rgen.nextInt(VYMIN, VYMAX);
		}

	}

}