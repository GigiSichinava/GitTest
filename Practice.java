import acm.graphics.GLine;
import acm.program.GraphicsProgram;
import java.awt.event.MouseEvent;

public class Practice extends GraphicsProgram {

	private int xs;
	private int ys;
	private GLine line;

	public void init() {
		xs = ys = 0;
		addMouseListeners();
	}

	public void mousePressed(javafx.scene.input.MouseEvent e) {
		line = new GLine(xs, ys, e.getX(), e.getY());
		add(line);
	}

	public void mouseDragged(MouseEvent e) {
		line.setEndPoint(e.getX(), e.getY());
	}

	public void mouseRelease(MouseEvent e) {
		xs = e.getX();
		ys = e.getY();
	}
}
