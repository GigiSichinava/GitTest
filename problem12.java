import java.awt.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class problem12 extends GraphicsProgram{
		public void run(){
			GRect rect = new GRect (100, 100, 150, 200);
			rect.setColor(Color.RED);			
			
			add(rect);
			
			GRect rect2 = new GRect (120, 120, 40, 70);
			rect2.setColor(Color.BLACK);
		}
		
		
	
}

