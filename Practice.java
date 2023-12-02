import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import javafx.scene.input.MouseEvent;

public class Practice extends GraphicsProgram{
	
	private double prevX;
	private double prevY;
	private static final int R = 50;
	private GOval oval;
	
	public void run(){
		
		oval = new GOval(2 * R, 2 * R);
		oval.setFilled(true);
		add(oval);
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e){
		GObject obj = getElementAt(e.getX(), e.getY());
		if (obj != null){
			prevX = e.getX();
			prevY = e.getY();
		}
	}
	
	
//	public void mouseDragged(MouseEvent e){
//		GObject obj = getElementAt(e.getX(), e.getY());
//		if(obj != null){
//			prevX = e.getX();
//			prevY = e.getY();
//		}
//	}
}