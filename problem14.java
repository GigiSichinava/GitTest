
import java.awt.Color;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class problem14 extends GraphicsProgram {
	
	private static final double HEAD_LENGTH = 350;
	private static final double EYE_MARGIN = 40;
	private static final double EYE_DIAMETER = 100; 
	private static final double MOUTH_HEIGHT = 35;
	private static final double MOUTH_MARGIN = 40;
	private static final Color MOUTH_COLOR = Color.RED;
	private static final Color LEFT_EYE_COLOR = Color.BLUE;
	private static final Color RIGHT_EYE_COLOR = Color.GREEN;
	
	public void run() {
		drawHead();
		drawEyes();
		drawMouth();
	}
	
	private void drawMouth() {
		GRect mouth = new GRect(HEAD_LENGTH - EYE_DIAMETER - 2 * EYE_MARGIN, MOUTH_HEIGHT);
		mouth.setFilled(true);
		mouth.setColor(MOUTH_COLOR);
		double x = getWidth() / 2 - HEAD_LENGTH / 2 + EYE_MARGIN + EYE_DIAMETER / 2;
		double y = getHeight() / 2 + HEAD_LENGTH / 2 - MOUTH_MARGIN - MOUTH_HEIGHT;
		add(mouth, x, y);
	}
	
	private void drawHead() {
		GRect head = new GRect(HEAD_LENGTH, HEAD_LENGTH);
		add(head, getWidth() / 2 - HEAD_LENGTH / 2, getHeight() / 2 - HEAD_LENGTH / 2);
	}
	
	private void drawEyes() {
		drawLeftEye();
		drawRightEye();
	}
	
	private void drawLeftEye() {
		double x = getWidth() / 2 - HEAD_LENGTH / 2 + EYE_MARGIN;
		double y = getHeight() / 2 - HEAD_LENGTH / 2 + EYE_MARGIN;
		GOval eye = new GOval(EYE_DIAMETER, EYE_DIAMETER);
		eye.setFilled(true);
		eye.setColor(LEFT_EYE_COLOR);
		add(eye, x, y);
	}
	
	private void drawRightEye() {
		double x = getWidth() / 2 + HEAD_LENGTH / 2 - EYE_MARGIN - EYE_DIAMETER;
		double y = getHeight() / 2 - HEAD_LENGTH / 2 + EYE_MARGIN;
		GOval eye = new GOval(EYE_DIAMETER, EYE_DIAMETER);
		eye.setFilled(true);
		eye.setColor(RIGHT_EYE_COLOR);
		add(eye, x, y);
	}
	

}