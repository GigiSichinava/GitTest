import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Practice extends GraphicsProgram {

	private static final int X = 100; 
	private GRect rect = new GRect(100, 100, 100, 100);

	public void run() {

		GRect rect = new GRect(X, X, 100, 100);
		add(rect);
		rect.setFilled(true);
		addMouseListeners();
	}

	public void mouseClicked(MouseEvent e) {
		if(getElementAt(100, 100) == rect){
			remove(rect);
		}

	}
}