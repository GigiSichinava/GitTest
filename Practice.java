import java.awt.event.MouseEvent;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Practice extends GraphicsProgram {

    private RandomGenerator rgen = RandomGenerator.getInstance();
    private static final double PAUSE = 50;
    private static final double R = 30;
    private static final double D = 2 * R;
    private static final int NUM_BALLS = 3; // Set the number of balls
    private GOval[] balls;

    public void run() {
        addMouseListeners();
        createBalls();
        while (true) {
            moveBalls();
            pause(PAUSE);
        }
    }

    private void createBalls() {
        balls = new GOval[NUM_BALLS];
        for (int i = 0; i < NUM_BALLS; i++) {
            GOval ball = new GOval(2 * R, 2 * R);
            ball.setFilled(true);
            ball.setColor(rgen.nextColor());
            balls[i] = ball;
            add(ball, rgen.nextDouble(0, getWidth() - D), rgen.nextDouble(0, getHeight() - D));
        }
    }

    private void moveBalls() {
        for (GOval ball : balls) {
            double dx = rgen.nextDouble(-5, 5); // Adjust the speed of balls
            double dy = rgen.nextDouble(-5, 5);
            
            if (ball.getX() + D > getWidth() || ball.getX() < 0) {
                dx = -dx;
                ball.setColor(rgen.nextColor());
            }
            if (ball.getY() + D > getHeight() || ball.getY() < 0) {
                dy = -dy;
                ball.setColor(rgen.nextColor());
            }
            
            ball.move(dx, dy);
        }
    }

    public void mouseClicked(MouseEvent e) {
        GObject obj = getElementAt(e.getX(), e.getY());
        if (obj == null) {
            for (GOval ball : balls) {
                ball.setColor(rgen.nextColor());
            }
        }
        for (GOval ball : balls) {
            if (obj == ball) {
                remove(ball);
            }
        }
    }
}
