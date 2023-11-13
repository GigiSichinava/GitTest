import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem42 extends GraphicsProgram {

	private static final int D = 30;

	GOval oval = new GOval (D, D);
	public void run() {
		addMouseListeners();
		createBall();
	}

	private void createBall() {
		oval.setFilled(true);
		add(oval);
	}

	public void mouseClicked (MouseEvent e){
		oval.setLocation(e.getX(), e.getY());
		
	}
}
