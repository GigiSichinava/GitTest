
import java.awt.Color;

import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Practice extends GraphicsProgram{
	
	private static final int WIDTH = 100;
	private static final int HEIGHT = 100;
	
	public void run(){
		
		int x = getWidth() / 2 ;
		int y = getHeight() / 2;
		
		int mainX = x - WIDTH / 2;
		int mainY =  y - HEIGHT / 2;
		
		GRect rect = new GRect (mainX, mainY, WIDTH, HEIGHT);
		rect.setFilled(true);
		rect.setColor(Color.RED);
		add(rect);
	
	}
}
