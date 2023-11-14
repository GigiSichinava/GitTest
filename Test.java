import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Test extends GraphicsProgram {

	private static final int R = 10;

	public void run() {

		addMouseListeners();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		GOval brush = new GOval (R, R);
		int x = e.getX() - R;
		int y = e.getY()- R;
		add(brush, x , y);
	}

	public void mousePressed(MouseEvent e){
			addBrush(e.getX() + R, e.getY() + R);
	}
	
	
	private void addBrush(int centerX, int centerY){
		GOval brush = new GOval (R, R);
		int x = centerX- R;
		int y = centerY - R;
		add(brush, x,y);
	}
}
