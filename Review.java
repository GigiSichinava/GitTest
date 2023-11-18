import acm.graphics.GOval;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Review extends GraphicsProgram {
	
	private static final int R = 50;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private int randomX = rgen.nextInt(R, getWidth());
	private int randomY = rgen.nextInt(R, getHeight());
	
	public void run() {
		
		GOval oval = new GOval(R, R);		
		add(oval, randomX - R, randomY - R);
	}
}
