import acm.graphics.GOval;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

public class Review extends GraphicsProgram {

	private static final int R = 20;
	private static final int NUM_OVAlS = 10;
	private GOval oval;

	public void run() {

		GOval[] ovalArray = new GOval[NUM_OVAlS];
		oval = new GOval(R, R);
		oval.setFilled(true);

		for (int i = 0; i < NUM_OVAlS; i++) {
			ovalArray[i] = oval;
		}

		for (int j = 0; j < ovalArray.length; j++) {
			add(ovalArray[j], 10, 10);
		}
	}
}

// oval.setFilled(true);
// add(oval);
// while (oval.getY() < getHeight() - 20) {
// oval.move(0, 10);
// pause(100);