import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Review extends GraphicsProgram{
	
	private static final int R = 50;
	private RandomGenerator rgen = new RandomGenerator();
	
	public void run(){
		
		
		
		GOval oval = new GOval(2 * R, 2 * R);
		oval.setFilled(true);
		add(oval, getWidth() / 2 - R, getHeight() / 2 - R);
		
	}
}