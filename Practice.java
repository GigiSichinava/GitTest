import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Practice extends GraphicsProgram{
	public void run(){
		
		GOval oval = new GOval (100, 100, 100, 100);
		oval.setFilled(true);
		oval.setColor(Color.RED
				);
		add(oval);
	}
}