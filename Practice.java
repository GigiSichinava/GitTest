import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Practice extends GraphicsProgram {	
	
	private static final int PAUSE = 100;
	private static final int R = 100;
	
	public void run(){
		
		GOval oval = new GOval(R, R);
		add(oval);
		oval.setLocation(0,0);
		
		
		while(oval.getX() != getHeight() - R * 2){
			pause(PAUSE);
			oval.move(10, 10);
						
		}
	
			
	}
}
	
	
	
		


	