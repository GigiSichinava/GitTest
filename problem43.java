import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem43 extends GraphicsProgram {

	private static final int R = 10;

	public void run() {

		addMouseListeners();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		GOval brush = new GOval(R, R);
		brush.setFilled(true);
		add(brush, e.getX() - R / 2, e.getY() - R / 2);
	}

	public void mousePressed(MouseEvent e) {
		addBrush(e.getX() + R / 2, e.getY() + R / 2);
	}

	private void addBrush(int centerX, int centerY) {
		GOval brush = new GOval(R, R);
		brush.setFilled(true);
		int x = centerX - R;
		int y = centerY - R;
		add(brush, x, y);
	}
}
