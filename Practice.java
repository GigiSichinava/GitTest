import acm.graphics.GLine;
import acm.program.GraphicsProgram;
import java.awt.event.MouseEvent;

public class Practice extends GraphicsProgram {
	
	private GLine line;
	private static final int x0 = 0;
	private static final int y0 = 0;
	
	public void run(){
		
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e){
		line = new GLine (x0, y0, e.getX(), e.getY());
		add(line);
		
	}
	
}
