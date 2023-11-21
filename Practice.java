import java.awt.event.MouseEvent;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Practice extends GraphicsProgram {

	private GRect rect = new GRect(10, 10, 10, 10);

	public void run() {

		addMouseListeners();
	}

	public void mouseMoved(MouseEvent e) {
		add(rect, e.getX(), e.getY());
	}

}
