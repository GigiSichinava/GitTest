import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Practice extends GraphicsProgram {

	private static final int X = 100; 
	private GRect rect = new GRect(100, 100, 100, 100);

	public void run() {

		add(rect);
		rect.setFilled(true);
		addMouseListeners();
	}

	public void mouseClicked(MouseEvent e) {
		GObject obj = getElementAt(e.getX(), e.getY());
		if(obj == rect){
			remove(rect);
		}

	}
}