import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Practice extends GraphicsProgram {	
	
	private static final int PAUSE = 1000;
	private static final int R = 100;
	
	public void run(){
		
		GOval oval = new GOval(R, R);
		add(oval, 10, 10);
						
		pause(PAUSE);
		oval.move(100, 100);
		

		
//		while(oval.getX() != 200){
//			oval.move(10, 10);
//			pause(1000);
//		}
//	
			
	}
}
	
	
	
		


	