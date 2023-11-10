import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class random extends GraphicsProgram {

	private final int PAUSE = 30;
	private final int D = 50;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private final int x = 1;
	private final int y = 3;
	private final double GRAVITY = 0.7;

	public void run() {

		GOval ball = new GOval (D, D);
		ball.setFilled(true);
		add(ball);		
		int dx = x;
		int dy = y;
		
		while(true){
		ball.move(dx, dy);
		pause(PAUSE);
		if(ball.getY() - D >= getHeight()){
			dy = -dy;
		}
		}
	}
	
	
}

