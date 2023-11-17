
import acm.graphics.GOval;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
import javafx.scene.input.MouseEvent;

public class Review extends GraphicsProgram {

	private static final int R = 20;
	GOval oval = new GOval (R, R);
	
	public void run(){
		addMouseListeners();
		GOval oval = new GOval (R, R);
		oval.setFilled(true);
		add(oval);		
	}

	public void mouseDragged(MouseEvent e){
		if(getElementAt(e.getX(), e.getY() == oval){
		oval.setLocation(e.getX() - x, e.getY() - y)	
		}
		
	}
	
	public void mousePressed(MouseEvent e){
		
	}
	
}