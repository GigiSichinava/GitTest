import java.awt.event.MouseEvent;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Practice extends GraphicsProgram {

	private GRect rect = new GRect(100, 100, 100, 100);

	public void run() {

		GRect rect = new GRect(100, 100, 100, 100);
		rect.setFilled(true);
//		add(rect);
		addMouseListeners();
	}

	public void mouseClicked(MouseEvent e){
		if (getElementAt(e.getX(), e.getY()) == rect){
			remove(rect);
		}
		
	}
}