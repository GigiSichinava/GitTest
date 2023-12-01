import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class Practice extends GraphicsProgram {
	
	private GLine line;
	
	private double x1 = 0;
	private double y1 = 0;
	private double x2 = 0;
	private double y2 = 0;
	
	
	
	public void run(){
		
		addMouseListeners();
		add(line);
	}

	public void mouseClicked(MouseEvent e) {
		
		
		line.setLocation(e.getX(), e.getY());
	
	}
}