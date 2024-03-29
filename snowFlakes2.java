import java.awt.Color;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class snowFlakes2 extends GraphicsProgram {

    private RandomGenerator rgen = RandomGenerator.getInstance();
    private static final int R = 3;
    private static final int NUM = 500;
    private GOval oval;

    public void run() {
        setBackground(Color.cyan);
        GOval[] myArray = new GOval[NUM];
        for (int i = 0; i < NUM; i++) {
            myArray[i] = new GOval(2 * R, 2 * R);
            myArray[i].setFilled(true);
            myArray[i].setColor(Color.WHITE);
            add(myArray[i], rgen.nextInt(0, getWidth() - 2 * R), rgen.nextInt(0, getHeight() - 2 * R));
        }

        while (true) {
            for (int i = 0; i < NUM; i++) {
                // Generate a small random horizontal movement
                double dx = rgen.nextDouble(-1.5, 1.5);
                myArray[i].move(dx, 3);
                
                if (myArray[i].getY() > getHeight()) {
                    add(myArray[i], rgen.nextInt(0, getWidth() - 2 * R), -2 * R);
                }
            }
            pause(50);
        }
    }
}
