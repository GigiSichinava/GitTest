import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Practice extends GraphicsProgram {

	private RandomGenerator rgen = RandomGenerator.getInstance();

	private GObject ball;
	private GObject rect;
	private static final double D = 100;
	private static final double x = 200;
	private static final double y = 100;

	private double prevX;
	private double prevY;

	public void run() {
		addMouseListeners();
		addBall();
		addRect();
	}

	private void addBall() {
		ball = new GOval(D, D);
		((GOval) ball).setFilled(true);
		add(ball, rgen.nextDouble(0, getWidth() - D), rgen.nextDouble(0, getHeight() - D));
	}

	private void addRect() {
		rect = new GRect(x, y);
		((GRect) rect).setFilled(true);
		add(rect, rgen.nextDouble(0, getWidth() - x), rgen.nextDouble(0, getHeight() - y));

	}

	public void mousePressed(MouseEvent e) {
		GObject obj = getElementAt(e.getX(), e.getY());
		if (obj == rect || obj == rect) {
			prevX = e.getX();
			prevY = e.getY();
		}
	}

	public void mouseDragged(MouseEvent e) {
		double x = e.getX() - prevX;
		double y = e.getY() - prevY;
		rect.move(x, y);
		ball.move(x, y);
		prevX = e.getX();
		prevY = e.getY();

	}
}