import acm.graphics.*;
import acm.program.GraphicsProgram;

public class GraphicPractice extends GraphicsProgram {
	public void run(){
		
		GOval myOval = new GOval (200, 200);
		add(myOval, 100, 100);
		
		GOval secondOval = new GOval (200, 200);
		add (secondOval, 200, 200);
		
		myOval = new GOval (200, 200);
		add(myOval, 250, 250);
		
	}
	
}
