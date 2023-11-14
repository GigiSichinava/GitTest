import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem45 extends GraphicsProgram{
	
	GOval oval;
	private static final int D = 50;
	
	public void run(){
		oval = new GOval (D, D);	
		oval.setFilled(true);
		add(oval, getWidth()/2 - D/2, getHeight()/2 - D/2);
		addMouseListeners();
	}

	
	public void mousePressed(MouseEvent e){
		
	}

	public void mouseDragged(MouseEvent e){
		
	}



}





