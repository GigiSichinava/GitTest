import java.awt.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Practice extends GraphicsProgram{
	public void run(){
		
		GRect rect = new GRect (100, 100);
		rect.setFilled(true);
		rect.setFillColor(Color.RED);
		add(rect, getWidth() / 2 - 50, getHeight() / 2 - 50);
	}
}