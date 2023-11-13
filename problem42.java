import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;


public class problem42 extends GraphicsProgram{

	private static final int D = 30;
	private static GOval oval;
	
	public void run(){
		addMouseListeners();
		createBall();
	}

	private void createBall() {
		add(oval);
	}

	
	public void mouseClicked (MouseEvent e){
		GOval oval = new GOval (D, D);
		oval.setFilled(true);
		
		
	}
	
}
