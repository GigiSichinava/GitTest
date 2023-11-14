import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem45 extends GraphicsProgram{
	
	GOval oval;
	private static final int D = 50;
	
	public void run(){
		oval = new GOval (D, D);	
		addMouseListeners();
	}

	
	public void mousePressed(MouseEvent e){
		oval.setFilled(true);
		add(oval, getWidth() - D/2, getHeight() - D/2);
	}

	public void mouseDragged(MouseEvent e){
		
	}



}





