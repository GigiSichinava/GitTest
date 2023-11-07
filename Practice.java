import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Practice extends GraphicsProgram {	
	
	private static final int PAUSE = 100;
	private static final int D = 100;
	
	public void run(){
		
		GOval oval = new GOval(D, D);
		add(oval);
		oval.setLocation(0,0);
		
		
		while(oval.getY() <= getHeight() - D){
			pause(PAUSE);
			oval.move(5, 5);			
		}
		
		while(oval.getX() <= getWidth() - D){
			pause(PAUSE);
			oval.move(5, -5);			
		}
		
		while(oval.getX() >= getWidth() - D){
			pause(PAUSE);
			oval.move(-5, -5);
		}
		
		
	}
}
	
	
	
		


	