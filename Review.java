import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Review extends GraphicsProgram{
	
	private RandomGenerator rgen =  RandomGenerator.getInstance();
	
	private static final double c = 10;
	private static final double RADISU_MIN = 50;
	private static final double V_MIN = 1;
	private static final double V_MAX = 5;
	
	
	public void run(){
		addMouseListeners();
		addRandomCircle();
		
	}
	
	private void addRandomCircle(){
		double radius = rgen.nextDouble(RADISU_MIN, RADISU_MIN);
		GOval circle = new GOval(radius, radius);
		circle.setFilled(true);
		circle.setColor(rgen.nextColor)());
		
		double x = rgen.nextDouble(0, getWidth() - 2 * radius);
		double y = rgen.nextDouble(0, getHeight() - radius * 2)
		add(circle, x, y);
		
	}
}