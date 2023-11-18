import acm.graphics.GOval;
//import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Review extends GraphicsProgram {
	
	private static final int R = 50;
	private int width = getWidth();
	private int height = getHeight();
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private int randomX = rgen.nextInt(R, height);
	private int randomY = rgen.nextInt(R, width);
	
	
	public void run() {
		
		GOval oval = new GOval(R, R);		
		add(oval, randomX - R, randomY - R);
	}
}
