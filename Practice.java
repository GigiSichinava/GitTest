import acm.graphics.GLine;
import acm.program.GraphicsProgram;
import javafx.scene.input.MouseEvent;

public class Practice extends GraphicsProgram{
	
	private GLine line;
	private double x1 = 0;
	private double y1 = 0;
	
	public void run(){
		addMouseListeners();
		
	}
	
	public void mousePressed(MouseEvent e){
		
		double x2 = e.getX();
		double y2 = e.getY();
		
		
		line = new GLine (x1, y1, x2, y2);
		add(line);
		
		
	}
}