import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class GraphicPractice extends GraphicsProgram {
	public void run(){
		
		GOval myOval = new GOval (200, 200);
		add(myOval, 100, 100);
		myOval.setFilled(true);
		myOval.setColor(Color.RED);
		
		myOval = new GOval (200, 200);
		add(myOval, 250, 100);
		
		
	}
	
}
