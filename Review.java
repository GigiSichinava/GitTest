import acm.graphics.GObject;
import acm.graphics.GRect;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

public class Review extends GraphicsProgram{
	public void run(){
		
		
		GRect rect = new GRect (10, 10);
		GObject obj = getElementAt(10, 10);
		if(rect == obj){
			remove(obj);
		}
		
	
	
	}
}