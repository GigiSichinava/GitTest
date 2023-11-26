import acm.graphics.GLine;
import acm.program.GraphicsProgram;
import java.awt.event.MouseEvent;

public class Practice extends GraphicsProgram {

	private GLine line;
	private int x0;
	private int y0;

	public void run() {
		x0 = y0 = 0;
		addMouseListeners();
	}

	public void mousePressed(MouseEvent e) {
		line = new GLine(x0, y0, e.getX(), e.getY());
		add(line);
	}

	public void mouseRelease(MouseEvent e) {
		x0 = e.getX();
		y0 = e.getY();
	}
}
