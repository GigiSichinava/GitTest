import acm.graphics.GOval;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

public class Review extends GraphicsProgram{
	public void run(){
		GOval oval = new GOval(20,20,20,20);
		oval.setFilled(true);
		add(oval);
		while(oval.getY() < getHeight() - 20){
			oval.move(0, 10);
			pause(100);
		}
	}
	
}