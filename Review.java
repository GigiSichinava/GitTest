import acm.graphics.GOval;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

public class Review extends GraphicsProgram{
	public void run(){
		GOval oval = new GOval(10,10,10,10);
		add(oval);
		while(oval.getY() < getHeight()){
			oval.move(0, 10);
		}
	}
	
}