import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Practice extends GraphicsProgram{
	
	private static final double PAUSE = 50;
	private static final double R = 30;
	private static final double D = 2 * R;
	private GOval ball;
	
	public void run(){
		addBall();
		while(true){
			double dx = 10;
			double dy = 10;
			if(ball.getX() + D > getWidth()){
				dx = -dx;
			}
			if(ball.getY() + R > getHeight()){
				dy = -dy;
			} 
			if(ball.getX() > 0){
				dx = dx;
			}
			if(ball.getY() < getHeight()){
				dy = dy;
			}
			ball.move(dx, dy);
			pause(PAUSE);
			
		}
	}
	private void addBall(){
		ball = new GOval(2 * R, 2 * R);
		ball.setFilled(true);
		add(ball);
	}
}