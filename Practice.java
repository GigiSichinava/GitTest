import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import javafx.scene.input.MouseEvent;

public class Practice extends GraphicsProgram {

	private static final int D = 50;
	private GOval oval;
	private double prevX;
	private double prevY;

	public void run() {

		oval = new GOval(D, D);
		oval.setFilled(true);
		add(oval, getWidth() / 2 - D / 2, getHeight() / 2 - D / 2);
		addMouseListeners();
	}

	private void mousePressed(MouseEvent e) {
		GObject object = getElementAt(e.getX(), e.getY());
		if (object != null) {
			prevX = e.getX();
			prevY = e.getY();
		}
	}

	private void mouseDreagged(MouseEvent e) {
		GObject object = getElementAt(e.getX(), e.getY());
		if (object != null) {
			object.move(e.getX() - prevX, e.getY() - prevY);
			prevX = e.getX();
			prevY = e.getY();
		
		}
	}

}