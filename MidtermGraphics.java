import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class MidtermGraphics extends GraphicsProgram{
	
	private RandomGenerator rgen =  RandomGenerator.getInstance();
	
	private GOval circle = null;
	
	private static final double c = 10;
	private static final double RADISU_MIN = 50;
	private static final double V_MIN = 1;
	private static final double V_MAX = 5;
	
	private static final int DELAY = 50;
	
	private double vx = 0;
	private double vy = 0;
	
	public void run(){
		addMouseListeners();
		addRandomCircle();
		
		while(true){
			
			if(circle.getX() < 0){
				vx = -vx;
			} 
			if (circle.getX() > getWidth() - circle.getWidth()){
				vx = -vx;
			}

			if(circle.getY() < 0){
				vy = -vy;
			} 
			if (circle.getY() > getHeight() - circle.getHeight()){
				vy = -vy;
			}
			
			
			circle.move(vx,  vy);
			pause(DELAY);
		}
		
	}
	
	private void addRandomCircle(){
		double radius = rgen.nextDouble(RADISU_MIN, RADISU_MIN);
		circle = new GOval(2  * radius, 2 * radius);
		circle.setFilled(true);
		circle.setColor(rgen.nextColor());
		
		double x = rgen.nextDouble(0, getWidth() - 2 * radius);
		double y = rgen.nextDouble(0, getHeight() - 2 * radius);
		add(circle, x, y);
		
	}
	
	public void mouseClicked(MouseEvent e){
		
		GObject obj = getElementAt(e.getX(), e.getY());
		if(obj == circle){
			vx = rgen.nextDouble(V_MIN, V_MAX);
			if(rgen.nextBoolean(0.5)){
				vx = -vx;
			}
			vy = rgen.nextDouble(V_MIN, V_MAX);
			if(rgen.nextBoolean(0.5)){
				vy = -vy;
			}
			circle.setColor(rgen.nextColor());
		}	
	}
	

}