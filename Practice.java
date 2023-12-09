import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Practice extends GraphicsProgram{

	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	private GObject ball;
	private GObject rect;
	private static final double  R = 100;
	private static final double x = 100;
	private static final double y = 200;
	
	public void run(){
		addBall();
		addRect();
	}
	private void addBall(){
		ball = new GOval(R, R);
		((GOval) ball).setFilled(true);
		add(ball, rgen.nextDouble(R, getWidth() - 2 * R), rgen.nextDouble(R, getHeight() - 2 * R));
	}
	private void addRect(){
		rect = new GRect (x, y);
		((GRect)rect).setFilled(true);
		add(rect, rgen.nextDouble(x, getWidth() - x), rgen.nextDouble(y, getHeight() - y));

	}
	
}