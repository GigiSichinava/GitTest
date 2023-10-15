import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class GraphicPractice extends GraphicsProgram {
	public void run(){
		
		GRect rect = new GRect (20, 20);
		rect.setFilled(true);
		rect.setColor(Color.BLUE);
		add(rect, 90, 90);
		
	}
	
}
