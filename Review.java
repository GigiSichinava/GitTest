import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Review extends GraphicsProgram{
	
	private static final int NUM = 100;
	private static final int R = 5;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	
	public void run(){
		
		GOval[] flakes = new GOval[NUM];
		
		for(int i = 0; i < NUM; i++){
			flakes[i] = new GOval(2 * R, 2 * R);
			flakes[i].setFilled(true);
			flakes[i].setColor(Color.BLUE);
			add(flakes[i]);
			flakes[i].setLocation(rgen.nextInt(0, getWidth() - 2 * R), rgen.nextInt(0, getHeight() - 2 * R));
		}
	
		
	}
}