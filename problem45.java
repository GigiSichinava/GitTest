import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem45 extends GraphicsProgram {

	GOval oval;
	private static final int D = 50;
	private int prevX;
	private int prevY;

	public void run() {
		oval = new GOval(D, D);
		oval.setFilled(true);
		add(oval, getWidth() / 2 - D / 2, getHeight() / 2 - D / 2);
		addMouseListeners();
	}

	public void mousePressed(MouseEvent e) {
		GObject obj = getElementAt(e.getX(), e.getY());
		if (obj != null) {
			prevX = e.getX();
			prevY = e.getY();
		}
	}

	public void mouseDragged(MouseEvent e) {
		GObject obj = getElementAt(e.getX(), e.getY());
		if (obj != null) {
			
			//move object
			obj.move(e.getX() - prevX, e.getY() - prevY);
			
			//updated info
			prevX = e.getX();
			prevY = e.getY();
		}
	}
}
