import java.awt.event.MouseEvent;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Practice extends GraphicsProgram {

	private GRect rect = new GRect(10, 10, 10, 10);

	public void run() {

		GRect rect = new GRect(10, 10, 10, 10);
		add(rect);
		addMouseListeners();
	}

	public void mouseClicked(MouseEvent e){
		add(rect, e.getX(), e.getY());
	}

}
