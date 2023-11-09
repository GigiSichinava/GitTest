import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class random extends GraphicsProgram {

	private final int PAUSE = 30;
	private final int D = 100;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private final int x = 10;
	private final int y = 10;

	public void run() {

		GOval oval = new GOval(D, D);
		add(oval, 0, 0);

		while (true) {

			if(oval.getY() < getHeight() - D ){
				pause(PAUSE);
				oval.move(x, y);
			}
			
			if(oval.getY() < getHeight() ) {
				pause(PAUSE);
				oval.move(x, -y);
				
			}
			
//			if(oval.getY() >  getHeight()  - D / 2){
//				pause(PAUSE);
//				oval.move(x, -y);
//			}
				
//			Color color1 = rgen.nextColor();
//			while (oval.getX() <= getWidth() - D) {
//				pause(PAUSE);
//				oval.move(10, 0);
//				oval.setFilled(true);
//				oval.setColor(color1);
//			}
//
//			Color color2 = rgen.nextColor();
//			while (oval.getX() >= 0) {
//				pause(PAUSE);
//				oval.move(-10, 0);
//				oval.setFilled(true);
//				oval.setColor(color2);
			}

		}

	}

