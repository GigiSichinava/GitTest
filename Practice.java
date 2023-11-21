import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import javafx.scene.input.MouseEvent;

public class Practice extends GraphicsProgram {
	
	private static final int R = 50;
	private GOval brush = new GOval (R, R);
	
	public void run() {
		addMouseListeners();
	}

	public void mousePressed(MouseEvent e){
		add(brush, e.getX(), e.getY());
		
	}

	private void addBrush(){
		GOval brush = new GOval (R, R);
		
				
	}
	
}