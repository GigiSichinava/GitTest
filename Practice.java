import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Practice extends GraphicsProgram{
	
	private GOval oval;
	
	private static final int MAX_RADIUS = 100;
	private static final int MIN_RADIUS = 10;
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run(){
		
		addMouseListeners();
		addRandomCircle();
		
	}
	
	private void addRandomCircle(){
		int R = rgen.nextInt(MIN_RADIUS, MAX_RADIUS);
		
		oval = new GOval(MIN_RADIUS, MAX_RADIUS);
		oval.setFilled(true);
		oval.setColor(rgen.nextColor());
		add(oval, getWidth() - R, getHeight() - R);
		
	}
	
}