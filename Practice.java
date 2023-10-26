
import java.awt.Color;

import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Practice extends GraphicsProgram{
	
	private static final int WIDTH = 200;
	private static final int HEIGHT = 200;
	private static final int LEFT_EYE_DIAMETER = 50;
	private static final int RIGHT_EYE_DIAMETER = 50;
	
	public void run(){
		
	// 	HEAD OF THE ROBOT	
		//Find center of the tab
		int x = getWidth() / 2 ;
		int y = getHeight() / 2;
		
		//Make robot's face centered
		int mainX = x - WIDTH / 2;
		int mainY =  y - HEIGHT / 2;
		
		// Add head of the robot
		GRect rect = new GRect (mainX, mainY, WIDTH, HEIGHT);
		rect.setFilled(true);
		rect.setColor(Color.RED);
		add(rect);
	
	// EYES OF THE ROBOT
		
		// Left eye of the robot
		int mainXLeftEye = mainX + 40; 
		int mainYLeftEye = mainY + 40;	
		GOval leftEye = new GOval (mainXLeftEye, mainYLeftEye, LEFT_EYE_DIAMETER, LEFT_EYE_DIAMETER);
		leftEye.setFilled(true);
		leftEye.setColor(Color.BLACK);
		add(leftEye);
		
		//Right eye of the robot
		int mainXRightEye = mainX + WIDTH - RIGHT_EYE_DIAMETER - 40;
		int mainYRightEye = mainY + 40;
		GOval rightEye = new GOval ( mainXRightEye, mainYRightEye, RIGHT_EYE_DIAMETER, RIGHT_EYE_DIAMETER);
		rightEye.setFilled(true);
		rightEye.setColor(Color.BLACK);
		add(rightEye);
	}
}
