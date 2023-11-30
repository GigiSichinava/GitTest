import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Practice extends GraphicsProgram{
	
	private GOval oval;
	
	public void run(){

		
		addMouseListeners();
		oval = new GOval (100, 100, 100, 100);
		oval.setFilled(true);
		oval.setColor(Color.RED);
		add(oval);
		
		
		
	}
	
	public void mouseClicked(MouseEvent e){
		GObject obj = getElementAt(e.getX(), e.getY());
		if(obj == oval){
			remove(oval);
		}
	}
}