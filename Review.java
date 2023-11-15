import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Review extends GraphicsProgram {

	private static final int PAUSE = 10;
	private static final int R = 50;
	private GOval oval;

	public void run() {
		addMouseListeners();

		oval = new GOval(R * 2, R * 2 );
		oval.setFilled(true);
		add(oval);
		
		int vx = 0;
		int vy = 5;

		while (true) {
			pause(PAUSE);
			oval.move(vx, vy);
			if (oval.getY() + 2 * R >= getHeight() && oval.getY() <= getHeight()) {
				vy = -vy;
			}
			
		}
	}

	public void mouseClicked(MouseEvent e) {
		add(oval, e.getX() - R, e.getY() - R);
	}

}
