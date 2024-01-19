import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class FinalsProblem004 extends GraphicsProgram{
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	private JButton buttonUp;
	private JButton buttonDown;
	
	private static final int R = 40;
	
	private GOval redOval;
	private GOval blueOval;
	private GObject obj;
	
	private int RED_Vx = 2;
	private int RED_Vy = 0;
	private int BLUE_Vx = 0;
	private int BLUE_Vy = 2;
	
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
		
		addActionListeners(this);
		addMouseListeners();
	}
	
	public void run(){
		while(true){
			
			
			redOval.move(RED_Vx, RED_Vy);
			blueOval.move(BLUE_Vx, BLUE_Vy);

			pause(5);
			
			if(redOval.getX() + 2 * R > getWidth()){
				RED_Vx = -RED_Vx;
			}
			if(redOval.getX() < 0){
				RED_Vx = -RED_Vx;
			}
			
			if(blueOval.getY() + 2 * R > getHeight()){
				BLUE_Vy = -BLUE_Vy;
			}
			if(blueOval.getY() < 0){
				BLUE_Vy = -BLUE_Vy;
			}
		}
		
	}
	
	public void actionPerformed(ActionEvent e){
		String line = e.getActionCommand();
		if(line.equals("Up") && obj == redOval){
			if (RED_Vx > 0) {
			    RED_Vx++;
			} else {
			    RED_Vx--;
			}
		}
		if(line.equals("Up") && obj == blueOval){
			if (BLUE_Vy > 0) {
				BLUE_Vy++;
			} else {
				BLUE_Vy--;
			}		
		}
		if(line.equals("Down") && obj == redOval){
			if (RED_Vx > 0) {
			    RED_Vx--;
			} else {
			    RED_Vx++;
			}
		}
		if(line.equals("Down") && obj == blueOval){
			if (BLUE_Vy > 0) {
				BLUE_Vy--;
			} else {
				BLUE_Vy++;
			}	
		}
	}
	
	public void mouseClicked(MouseEvent e){
		obj = getElementAt(e.getX(), e.getY());
		if(obj == redOval || obj == blueOval){
			obj.setColor(Color.GREEN);
		}
	}
}
