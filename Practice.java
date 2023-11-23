import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Practice extends GraphicsProgram {
	public void run() {
		addMouseListeners();
	}

	public void mouseClicked(MouseEvent e){
		GOval oval = new GOval (10,10,10,10);
		add(oval);
	}
}