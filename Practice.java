
/*
- * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Practice extends GraphicsProgram {

	/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

	/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

	/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;

	// create new variables to use in the body of the code
	private double BeginningX = 0;
	private double BeginningY = 0;
	// create private double that we can use in 'for' cycle
	private double bricksNumber = BRICKS_IN_BASE;

	public void run() {
		
		double BeginningX = getWidth() / 2 - (BRICKS_IN_BASE / 2) * BRICK_WIDTH;
		double BeginningY = getHeight() - BRICK_HEIGHT;
		
				for ( int rows = 0; rows < BRICKS_IN_BASE; rows++){
					for ( int collumns = 0; collumns < BRICKS_IN_BASE; collumns++){
						
						GRect rect = new GRect (BeginningX, BeginningY , BRICK_WIDTH, BRICK_HEIGHT);
						add(rect);
					}
				}
		bricksNumber--;
		
		
	}
}
	