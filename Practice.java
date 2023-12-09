import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Practice extends GraphicsProgram{
	
	private static final double PAUSE = 50;
	private static final double R = 200;
	private GOval ball;
	
	public void run(){
		addBall();
		while(true){
			double dx = 10;
			double dy = 10;
			ball.move(dx, dy);
			pause(PAUSE);
			
		}
	}
	private void addBall(){
		ball = new GOval(R, R);
		ball.setFilled(true);
		add(ball);
	}
}