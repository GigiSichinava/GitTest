import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Review extends GraphicsProgram {

	
	private static final int R = 5;
	private GOval oval;

	public void run() {

		addBall();
		moveBall();
	}


	private void addBall() {
		GOval oval = new GOval(R * 2, R * 2);
		oval.setFilled(true);
		add(oval);
	}

	private void moveBall() {
		int vx = 0;
		int vy = 5;
		oval.move(vx,vy);
		if(oval.getY() >= getHeight()){
			vy = vy;
		}
	}
}
