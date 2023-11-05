import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class problem33 extends GraphicsProgram{
	
	private RandomGenerator rg = RandomGenerator.getInstance();
	
	public void run(){
		addRandomCircle();				
	}

	private void addRandomCircle() {
		double radius = rg.nextDouble(150, 200);
		double x = rg.nextDouble(10, getWidth() - radius * 2);
		double y = rg.nextDouble(20, getHeight() - radius * 2);
		Color color = rg.nextColor();
		
		GOval oval = new GOval (radius, radius);
		oval.setFilled(true);
		oval.setColor(color);
		add(oval, x ,y);
	}
}
