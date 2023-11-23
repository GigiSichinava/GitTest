import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Practice extends GraphicsProgram {

	private static final int R = 100;
	//private GOval oval = new GOval(2 * R, 2 * R);

	public void run() {
		addMouseListeners();
	}

	public void mouseClicked(MouseEvent e) {
		GOval oval = new GOval(2 * R, 2 * R);

		oval.setLocation(e.getX() - R, e.getY() - R);
	}
}