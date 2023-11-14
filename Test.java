import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Test extends GraphicsProgram {

	private static final int R = 20;

	public void run() {

		addMouseListeners();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		GOval brush = new GOval (R, R);
		int x = e.getX() - R;
		int y = e.getY()- R;
		add(brush, x , y);
		
	}

}
