import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class problem121314 extends GraphicsProgram {
//	private static final double PI = 3.14;
	private static final double HOUSE_WIDTH = 200;
	private static final double HOUSE_HEIGTH = 300;
	private static final double DOOR_WIDTH = 40;
	private static final double DOOR_HEIGHT = 80;


	public void run() {
			 
		drawWall();
//		drawDoof();
//		drawDoor();
//		drawWindow();
	}


	private void drawWall() {
		GRect wall = new GRect (HOUSE_WIDTH, HOUSE_HEIGTH);
		int x = (int) (getWidth() /2 - HOUSE_WIDTH /2);
		double y = getHeight() - HOUSE_HEIGTH;
		add (wall, x, y);
		}
		
	}	
		
//			drawMidLine();
//		}
	
		/*		int a = 5;
			a = a+1;
			
			if (2 == 2 ) {
				double b = 3;
				b = 4;
				b = a + 3;				
			}
			
			b = b + 1;
	}

	private void testVoid() {
		int a = 7;
		
	}
	*/
	

//	private void drawMidLine() {
//		double x1 = 0;
//		double y1 = getHeight() / 2;
//		double x2 = getWidth();
//		double y2 = y1;
//		GLine Line = new GLine(x1, y1, x2, y2);
//		add (Line);
//	}
	
	
