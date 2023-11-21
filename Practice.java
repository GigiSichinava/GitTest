import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Practice extends GraphicsProgram {

	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int X = 100;
	private GRect rect = new GRect(X, X);
	private int rectX = rgen.nextInt(0, 550);
	private int rectY = rgen.nextInt(0, 550);

	public void run() {

		add(rect, rectX, rectY);
		rect.setFilled(true);
		rect.setColor(rgen.nextColor());
		addMouseListeners();
	}

	private void addRect() {
		add(rect, rectX, rectY);
		rect.setFilled(true);
		rect.setColor(rgen.nextColor());
	}

	public void mouseClicked(MouseEvent e) {
		GObject obj = getElementAt(e.getX(), e.getY());
		if (obj == rect) {
			remove(rect);
		}
		int rectX2 = rgen.nextInt(0, 550);
		int rectY2 = rgen.nextInt(0, 550);
		add(rect, rectX2, rectY2);
		rect.setColor(rgen.nextColor());
	}
}