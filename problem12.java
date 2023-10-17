import java.awt.Color;

import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class problem12 extends GraphicsProgram{
		public void run(){
			GRect rect = new GRect (100, 100, 150, 200);
			rect.setColor(Color.RED);			
			rect.setFilled(true);
			add(rect);
			
			GRect rect2 = new GRect (120, 130, 40, 60);
			rect2.setColor(Color.BLACK);
			rect2.setFilled(true);
			add(rect2);
		
		
			GRect rect3 = new GRect (190, 130, 40, 60);
			rect3.setColor(Color.BLACK);
			rect3.setFilled(true);
			add(rect3);
			
			GRect rect4 = new GRect (150, 215, 50, 80);
			rect4.setColor(Color.BLACK);
			add(rect4);
			
			GLine line = new GLine (100, 100, 175, 50);
			line.setColor(Color.RED);
			add(line);
			
			GLine line2 = new GLine (175, 50, 250, 100);
			line2.setColor(Color.RED);
			add(line2);
			
			GOval oval = new GOval (160, 250, 8, 8);
			oval.setColor(Color.BLACK);
			oval.setFilled(true);
			add(oval);
			
			
		}
		
		
		
		
	
}

