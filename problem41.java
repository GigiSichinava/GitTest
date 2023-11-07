import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem41 extends GraphicsProgram{
	
	private final int PAUSE = 30;
	private final int D = 100;
	public void run(){
		
		GOval oval = new GOval (D, D);
		add(oval, 0, getHeight() / 2 - D / 2);
	
	while(oval.getX() <= getWidth() - D  ){
		pause(PAUSE);
		oval.move(10, 0);
	}
	
	
	
	}
}
