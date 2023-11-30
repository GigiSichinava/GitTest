import acm.graphics.GObject;
import acm.graphics.GRect;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

public class Review extends GraphicsProgram{
	public void run(){
		
		
		GRect rect = new GRect (10, 10);
		add(rect);
		GObject obj = getElementAt(0, 0);
		if(rect == obj){
			remove(obj);
		}
		
	
	
	}
}