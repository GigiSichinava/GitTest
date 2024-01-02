import acm.graphics.GOval;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Review extends GraphicsProgram {

	private static final int R = 20;
	private static final int NUM_OVAlS = 10;
	private GOval oval;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {

		GOval[] ovalArray = new GOval[NUM_OVAlS];
		oval = new GOval(2 * R, 2 * R);
		oval.setFilled(true);

		for (int i = 0; i < NUM_OVAlS; i++) {
			ovalArray[i] = oval;
		}

		for (int j = 0; j < ovalArray.length; j++) {
			add(ovalArray[j], rgen.nextInt(R, getWidth() - R), rgen.nextInt(R, getWidth() - R));
		}
	}
}

// oval.setFilled(true);
// add(oval);
// while (oval.getY() < getHeight() - 20) {
// oval.move(0, 10);
// pause(100);