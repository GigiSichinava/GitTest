
import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class Practice extends GraphicsProgram{
	
	
	public void run(){
		int x = getWidth() ;
		int y = getHeight() / 2;
		
		GLine a = new GLine (0, y, x, y );
		add (a);
	
	
	}
}
