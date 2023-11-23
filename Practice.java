import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Practice extends GraphicsProgram {
	public void run() {
		addMouseListeners();
	}

	public void mouseClicked(MouseEvent e){
		GOval oval = new GOval (100, 100);
		add(oval, e.getX(), e.getY());
	}
}