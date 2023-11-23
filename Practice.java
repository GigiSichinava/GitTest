import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Practice extends GraphicsProgram {

	private static final int R = 100;
	GOval oval = new GOval(2 * R, 2 * R);

	public void run() {
		addMouseListeners();
	}

	public void mouseClicked(MouseEvent e) {
		add(oval, e.getX() - R, e.getY() - R);
	}
}