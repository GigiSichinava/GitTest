import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Review extends GraphicsProgram {

    private static final int NUM_SNOWFLAKES = 100; // Total number of snowflakes
    private static final int SNOWFLAKE_SIZE = 5;   // Size of each snowflake
    private static final int DELAY = 50;           // Animation delay in milliseconds

    private RandomGenerator rgen = RandomGenerator.getInstance();

    public void run() {
        GOval[] snowflakes = new GOval[NUM_SNOWFLAKES];

        // Create and add snowflakes to the screen
        for (int i = 0; i < NUM_SNOWFLAKES; i++) {
            snowflakes[i] = new GOval(SNOWFLAKE_SIZE, SNOWFLAKE_SIZE);
            snowflakes[i].setFilled(true);
            int startX = rgen.nextInt(0, getWidth() - SNOWFLAKE_SIZE);
            int startY = rgen.nextInt(0, getHeight() - SNOWFLAKE_SIZE);
            snowflakes[i].setLocation(startX, startY);
            add(snowflakes[i]);
        }

        // Animate snowflakes
        while (true) {
            for (int i = 0; i < NUM_SNOWFLAKES; i++) {
                snowflakes[i].move(0, rgen.nextInt(1, 5)); // Move down randomly

                // Reset to top if it goes off the screen
                if (snowflakes[i].getY() > getHeight()) {
                    snowflakes[i].setLocation(rgen.nextInt(0, getWidth() - SNOWFLAKE_SIZE), -SNOWFLAKE_SIZE);
                }
            }
            pause(DELAY);
        }
    }

    public static void main(String[] args) {
        new Review().start(args);
    }
}
