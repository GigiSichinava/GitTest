import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class GravityBall extends GraphicsProgram{
	
	final static double D = 50;
	final static double PAUSE = 10;
	final static double x = 10;
	final static double y = 10;
	
			
	
	public void run(){
		
		GOval oval = new GOval (D, D);
		oval.setFilled(true);
		add(oval);
		
		double dx = x;
		double dy = y;
		
		while (oval.getY() < getHeight() - D){
			
		}
	}
	

}
