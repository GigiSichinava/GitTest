import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Problem46 extends GraphicsProgram {

	private static final int V_Y = 10;
	private GObject circle;
	private static final int R = 50;

	public void run() {
		addMouseListeners();
		
		circle = new GOval(R, R);
		((GOval) circle).setFilled(true);
		add(circle);
		int v = V_Y;
		while (true) {
			circle.move(0, V_Y);
			pause(10);
			if (circle.getY() >= getHeight() - 2 * R) {
				v = -v;
			}
		}

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		add(circle, e.getX() - R / 2, e.getY() - R / 25);
	}
}
