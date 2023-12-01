import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class Practice extends GraphicsProgram {

	private GLine line;
	
	private double x1 = 0;
	private double y1 = 0;

	public void run() {

		addMouseListeners();

	}

	public void mouseClicked(MouseEvent e) {

		double x2 = e.getX();
		double y2 = e.getY();

		GLine line = new GLine(x1, y1, x2, y2);
		add(line);

		x1 = x2;
		y1 = y2;	

	}
	
	public void mouseDragged(MouseEvent e){
		line.setEndPoint(e.getX(), e.getY());
	}
	public void mouseRelease(MouseEvent e){
		x1 = e.getX();
		y1 = e.getY();
	}
}