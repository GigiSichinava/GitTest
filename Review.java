import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GRect;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;


public class Review extends GraphicsProgram {

	private GObject rect;
	private GObject obj;
	
	public void run(){
		
		
		GRect rect = new GRect (10, 10);
		add(rect);
		GObject obj = getElementAt(10, 10);
		if(rect == obj){
			remove(obj);
		}
		addMouseListeners();
	}
	
	
	public void mouseClicked (MouseEvent e){		
		
		if (e.getX() == rect.getX()){
			remove(obj);
		}
		
	}
	
	}
	
	
	
