import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Practice extends GraphicsProgram {

	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int X = 100;
	private GRect rect = new GRect(X, X);

	public void run() {

		int rectX = rgen.nextInt(0, getWidth() - X/2);
		int rectY = rgen.nextInt(0, getHeight() - X/2);
		add(rect, rectX, rectY);
		rect.setFilled(true);
		rect.setColor(rgen.nextColor());
		addMouseListeners();
	}

	public void mouseClicked(MouseEvent e) {
		GObject obj = getElementAt(e.getX(), e.getY());
		if (obj == rect) {
			remove(rect);
		}

	}
}