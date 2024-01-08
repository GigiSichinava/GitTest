import java.awt.Color;
import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Practice extends GraphicsProgram {

    private static final int R = 5;
    private static final int NUM = 500;
    private static final int DELAY = 50;
    private static final int SHADOW_GAP = 5;

    private RandomGenerator rgen = RandomGenerator.getInstance();
    private GOval[] ovals = new GOval[NUM];
    private GLabel label;
    private GLabel shadowLabel;

    private GImage image;

    public void run() {
        setBackground(Color.BLUE);
        drawOvals();
        drawShadowLabel();
        drawLabel();
        addImage();

        while (true) {
            moveOvals();
            pause(DELAY);
        }
    }

    private void addImage() {
        image = new GImage("C:/Users/Gigi/OneDrive/Desktop/background.jpg", getWidth(), getHeight());
        add(image, 0, 0);
    }

    private void drawOvals() {
        for (int i = 0; i < NUM; i++) {
            ovals[i] = new GOval(R, R);
            ovals[i].setFilled(true);
            ovals[i].setColor(Color.WHITE);
            add(ovals[i], rgen.nextInt(0, getWidth() - 2 * R), rgen.nextInt(0, getHeight()));
        }
    }

    private void drawLabel() {
        label = new GLabel("Happy new 2024 Year!");
        label.setColor(Color.RED);
        label.setFont("SansSerif-50");
        add(label, getWidth() / 2 - label.getWidth() / 2, getHeight() / 2 - label.getAscent() / 2);
    }

    private void drawShadowLabel() {
        shadowLabel = new GLabel("Happy new 2024 Year!");
        shadowLabel.setColor(Color.BLACK);
        shadowLabel.setFont("SansSerif-50");
        add(shadowLabel, getWidth() / 2 - shadowLabel.getWidth() / 2 + SHADOW_GAP,
                getHeight() / 2 - shadowLabel.getAscent() / 2 + SHADOW_GAP);
    }

    private void moveOvals() {
        for (int i = 0; i < NUM; i++) {
            ovals[i].move(rgen.nextDouble(-1.5, 1.5), 4);
            if (ovals[i].getY() > getHeight()) {
                add(ovals[i], rgen.nextInt(0, getWidth() - 2 * R), -2 * R);
            }
        }
    }
}
