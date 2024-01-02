import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Review extends GraphicsProgram {

    private static final int R = 5;
    private static final int NUM_OVALS = 20;
    private RandomGenerator rgen = RandomGenerator.getInstance();

    public void run() {
        GOval[] ovalArray = new GOval[NUM_OVALS];

        // Create and add all GOvals
        for (int i = 0; i < NUM_OVALS; i++) {
            ovalArray[i] = new GOval(2 * R, 2 * R);
            ovalArray[i].setFilled(true);
            add(ovalArray[i], rgen.nextInt(R, getWidth() - R), -2 * R);
        }

        // Move all GOvals
        boolean ovalsMoving = true;
        while (ovalsMoving) {
            ovalsMoving = false;
            for (int i = 0; i < NUM_OVALS; i++) {
                if (ovalArray[i].getY() < getHeight()) {
                    ovalArray[i].move(0, 10);
                    ovalsMoving = true;
                }
            }
            pause(100);
        }
    }
}
