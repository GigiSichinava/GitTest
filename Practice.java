import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Practice extends GraphicsProgram{
	
	private GOval head;
	private GOval body;
	
	public void run(){
		head = new GOval (50, 50);
		body = new GOval (20, 150);
		add(head, getWidth() / 2 - 25, -50);
		add(body, -20, getHeight() / 2 - 75);
		while(head.getY() < 50){
			head.move(0, 5);
			pause(50);
		}
		while(body.getX() < getWidth() / 2 - 10){
			body.move(5, 0);
			pause(50);
		}
	}
}