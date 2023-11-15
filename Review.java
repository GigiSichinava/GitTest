import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Review extends GraphicsProgram {

	private static final int PAUSE = 100;
	private static final int R = 5;
	private GOval oval;

	public void run() {
		addMouseListeners();
		addBall();
		moveBall();
	}

	private void addBall() {
		GOval oval = new GOval(R * 2, R * 2);
		oval.setFilled(true);
	}

	private void moveBall() {
		pause(PAUSE);
		int vx = 0;
		int vy = 5;

		while (oval.getY() + 2 * R <= getHeight()) {
			oval.move(vx,vy);
			if (oval.getY() >= getHeight()) {
				vy = -vy;
			}
		}
	}

	public void MouseClicked(MouseEvent e) {
		add(oval, e.getX() - R, e.getY() - R);
	}

}
