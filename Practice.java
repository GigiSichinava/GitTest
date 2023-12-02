import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class Practice extends GraphicsProgram {

	private double x1 = 0;
	private double y1 = 0;
	private double x2;
	private double y2;

	private GLine line;

	public void run() {
		addMouseListeners();
	}

	public void mouseClicked(MouseEvent e) {
		x2 = e.getX();
		y2 = e.getY();

		line = new GLine (x1, y1, x2, y2);
		
		add(line);
		
		x1 = x2;
		y1 = y2;
	}
}