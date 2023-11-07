import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Practice extends GraphicsProgram {

	private static final int PAUSE = 10;
	private static final int D = 100;

	public void run() {

		GOval oval = new GOval(D, D);
		add(oval);
		oval.setLocation(0, 0);

		
		
		while (oval.getY() <= getHeight() - D) {
			pause(PAUSE);
			oval.move(10, 10);
		}

		while (oval.getX() <= getWidth() - D) {
			pause(PAUSE);
			oval.move(10, -10);
		}

		while (oval.getY() >= 0 ) {
			pause(PAUSE);
			oval.move(-10, -10);
		}

		while (oval.getX() >=  0 ) {
			pause(PAUSE);
			oval.move(-10, 10);
		
		}
		
	
	}
	
}
