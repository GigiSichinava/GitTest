
import java.awt.Color;

import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Practice extends GraphicsProgram{
	
	private static final int WIDTH = 200; //width of face 
	private static final int HEIGHT = 200; // height of face
	private static final int LEFT_EYE_DIAMETER = 45; //diameter of left eye
	private static final int RIGHT_EYE_DIAMETER = 45; // diameter of right eye
	private static final int MOUTH_WIDTH = 120; //width of mouth
	private static final int MOUTH_HEIGHT = 35; //height of mouth
	
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
		int mainXLeftEye = mainX + 35; 
		int mainYLeftEye = mainY + 35;	
		GOval leftEye = new GOval (mainXLeftEye, mainYLeftEye, LEFT_EYE_DIAMETER, LEFT_EYE_DIAMETER);
		leftEye.setFilled(true);
		leftEye.setColor(Color.BLACK);
		add(leftEye);
		
		//Right eye of the robot
			//To make left eye symmetrical of right eye, add 'mainX' width of the
			//robot's face and subtract diameter and space between left eye and face
		int mainXRightEye = mainX + WIDTH - RIGHT_EYE_DIAMETER - 35;
		int mainYRightEye = mainY + 35;
		GOval rightEye = new GOval ( mainXRightEye, mainYRightEye, RIGHT_EYE_DIAMETER, RIGHT_EYE_DIAMETER);
		rightEye.setFilled(true);
		rightEye.setColor(Color.BLACK);
		add(rightEye);
	
	// MOUTH OF THE ROBOT
		int mainXMouth = mainX + 40;
		int mainYMouth = mainY + 140;		
		GRect mouth = new GRect (mainXMouth, mainYMouth, MOUTH_WIDTH, MOUTH_HEIGHT);
		mouth.setFilled(true);
		mouth.setColor(Color.BLACK);
		add(mouth);
	
	}
}
