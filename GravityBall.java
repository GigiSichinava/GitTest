import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class GravityBall extends GraphicsProgram{
	
	final static double D = 50;
	final static double PAUSE = 10;
	final static double x = 1;
	final static double y = 4;
	final static double GRAVITY = 0.7;
	
	public void run(){
		
		GOval oval = new GOval (D, D);
		oval.setFilled(true);
		add(oval);
		
		double dx = x;
		double dy = y;
		
		while (true){
			oval.move(dx, dy);
//			dy =+ GRAVITY;
			pause(PAUSE);
			if(oval.getY() > getHeight() - D){
				dy = -dy;				
			}
		}
	}
	

}
