import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class Practice extends GraphicsProgram{
	
	private double x1;
	private double y1;
	private double x2;
	private double y2;
	
	private GLine line;
	
	public void run(){
		
		x1 = 0;
		y1 = 0;
		line = new GLine(x1, y1, x2, y2);
		addMouseListeners();
		
	}
	
	
	public void mouseClicked(MouseEvent e){
		x2 = e.getX();
		y2 = e.getY();
		
		line.setEndPoint(x2, y2);
		add(line);
	}
}