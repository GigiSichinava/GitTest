import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Practice extends GraphicsProgram {	
	
	private static final int R = 100;
	
	public void run(){
		
		GOval oval = new GOval(R, R);
		add (oval);
		
		oval.setLocation(10 ,10);
		oval.move(100, 100);
	}
}
	
	
	
		


	