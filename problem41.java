import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem41 extends GraphicsProgram{
	
	private final int PAUSE = 100;
	private final int R = 100;
	public void run(){
		
		GOval oval = new GOval (R, R);
		add(oval, getHeight() / 2, 0);
	
	while(oval.getX() <= getWidth() - R *2 ){
		pause(PAUSE);
		oval.move(10, 0);
	}
	
	
	
	}
}
