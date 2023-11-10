import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class random extends GraphicsProgram {

	private final int PAUSE = 30;
	private final int D = 100;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private final int x = 10;
	private final int y = 10;
	private final double GRAVITY = 0.7;

	public void run() {

		GOval ball = new GOval (50, 50);
		ball.setFilled(true);
		add(ball);		
		int dx = x;
		int dy = y;
		while(true){
			
		}
	}
	
	public void mouseMoved(MouseEvent e) {
		ball.
	}
}

