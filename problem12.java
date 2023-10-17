import java.awt.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class problem12 extends GraphicsProgram{
		public void run(){
			GRect rect = new GRect (100, 100, 150, 200);
			rect.setColor(Color.RED);			
			rect.setFilled(true);
			add(rect);
			
			GRect rect2 = new GRect (120, 130, 40, 70);
			rect2.setColor(Color.BLACK);
			add(rect2);
		
		
			GRect rect3 = new GRect (190, 130, 40, 70);
			rect3.setColor(Color.BLACK);
			add(rect3);
			
			GRect rect4 = new GRect (150, 200, 50, 80);
			rect4.setColor(Color.BLACK);
			add(rect4);
			
		}
		
		
		
		
	
}

