import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Practice extends GraphicsProgram{
	
	private static final double PAUSE = 50;
	private static final double R = 30;
	private GOval ball;
	
	public void run(){
		addBall();
		while(true){
			//ball.move(dx, dy);
			pause(PAUSE);
			
		}
	}
	private void addBall(){
		ball = new GOval(R, R);
		ball.setFilled(true);
		add(ball);
	}
}