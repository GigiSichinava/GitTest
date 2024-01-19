import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.JButton;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class FinalsProblem004 extends GraphicsProgram{
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	private JButton buttonUp;
	private JButton buttonDown;
	
	private static final int R = 50;
	
	private GOval redOval;
	private GOval blueOval;
	
	private int RED_Vx = 10;
	private int RED_Vy = 0;
	private int BLUE_Vx = 0;
	private int BLUE_Vy = 10;
	
	public void init(){
		
		buttonUp = new JButton("Up");
		add(buttonUp, SOUTH);
		
		buttonDown = new JButton("Down");
		add(buttonDown, SOUTH);
		
		redOval = new GOval(rgen.nextInt(0, getWidth() - 2 * R), rgen.nextInt(0, getHeight() - 2 * R), 2 * R, 2 * R);
		redOval.setFilled(true);
		redOval.setColor(Color.RED);
		add(redOval);
		
		blueOval = new GOval(rgen.nextInt(0, getWidth() - 2 * R), rgen.nextInt(0, getHeight() - 2 * R), 2 * R, 2 * R);
		blueOval.setFilled(true);
		blueOval.setColor(Color.BLUE);
		add(blueOval);
		
		addActionListeners();
	}
	
	public void run(){
		while(true){
			
			
			redOval.move(RED_Vx, RED_Vy);
			pause(10);
			
			if(redOval.getX() + 2 * R > getWidth()){
				RED_Vx = -RED_Vx;
			}
			if(redOval.getX() < 0){
				RED_Vx = -RED_Vx;
			}
			
			if(redOval.getY() + 2 * R > getHeight()){
				BLUE_Vy = -BLUE_Vy;
			}
			if(redOval.getY() < 0){
				BLUE_Vy = -BLUE_Vy;
			}
		}
		
	}
	
	public void actionPerformed(ActionEvent e){
		
	}
}
