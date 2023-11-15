import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Review extends GraphicsProgram {

	private static final int R = 10;
	
	public void run() {

		addMouseListeners();

	}
	
	public void mouseClicked(MouseEvent e){
		GOval oval = new GOval (2 * R,2 * R);
		add(oval, e.getX() - R, e.getY() - R);
	}
}