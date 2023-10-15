import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class GraphicPractice extends GraphicsProgram {
	public void run(){
		
		GRect rect = new GRect (50, 50);
		rect.setFilled(true);
		rect.setColor(Color.RED);
		add(rect, 60, 60);
	}
	
}
