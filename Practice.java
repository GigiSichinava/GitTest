import java.awt.Color;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Practice extends GraphicsProgram implements ComponentListener {

    private static final int R = 30;
    private static final int NUM = 100;

    private RandomGenerator rgen = RandomGenerator.getInstance();
    private GOval[] ovals = new GOval[NUM];
    private GLabel label;

    public void run() {
        setBackground(Color.BLUE);
    	addComponentListener(this);
        drawOvals();
        drawLabel();

        while (true) {
            moveOvals();
            pause(50);
        }
    }

    private void drawOvals() {
        for (int i = 0; i < NUM; i++) {
            ovals[i] = new GOval(R, R);
            ovals[i].setFilled(true);
            ovals[i].setColor(Color.WHITE);
            add(ovals[i], rgen.nextInt(0, getWidth()), rgen.nextInt(0, getHeight()));
        }
    }

    private void drawLabel() {
        label = new GLabel("Happy new 2024 Year!");
        label.setColor(Color.RED);
        label.setFont("SansSerif-50");
        add(label, getWidth() / 2 - label.getWidth() / 2, getHeight() / 2 - label.getAscent() / 2);
    }

    private void moveOvals() {
        for (int i = 0; i < NUM; i++) {
            ovals[i].move(rgen.nextInt(-2, 2), 5);
            if (ovals[i].getY() > getHeight()) {
                add(ovals[i], rgen.nextInt(0, getWidth()), -2 * R);
            }
        }
    }

    @Override
    public void componentResized(ComponentEvent e) {
        removeAll();
        drawOvals();
        drawLabel();
    }

    @Override
    public void componentMoved(ComponentEvent e) {
        // Do nothing
    }

    @Override
    public void componentShown(ComponentEvent e) {
        // Do nothing
    }

    @Override
    public void componentHidden(ComponentEvent e) {
        // Do nothing
    }
}
