import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class Problem44 extends GraphicsProgram{
	
	private GLine line;
	public void run(){
			addMouseListeners();
	}
	@Override
	public void mousePressed(MouseEvent e){
		line = new GLine (e.getX(), e.getY(), e.getX(), e.getY());
		add(line);
	
	
	public void mouseDragged (MouseEvent e){
		line.setEndPoint(e.getX(), e.getY());
	}
}
