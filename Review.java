import acm.graphics.GOval;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Review extends GraphicsProgram {

	private static final int R = 5;
	private static final int NUM_OVAlS = 20;
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {

		GOval[] ovalArray = new GOval[NUM_OVAlS];

		for (int i = 0; i < NUM_OVAlS; i++) {
			ovalArray[i] = new GOval(2 * R, 2 * R);
			ovalArray[i].setFilled(true);
			add(ovalArray[i], rgen.nextInt(R, getWidth() - R), -2 * R);
			
			while(ovalArray[i].getY() < getHeight()){
				ovalArray[i].move(0, 10);
				pause(100);
			}
		}
		
	}
}
