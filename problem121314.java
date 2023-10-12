import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class problem121314 extends GraphicsProgram {
	public void run() {
			 
			drawMidLine();
		}
	
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
	

	private void drawMidLine() {
		double x1 = 0;
		double y1 = getHeight() / 2;
		double x2 = getWidth();
		double y2 = y1;
		GLine Line = new GLine(x1, y1, x2, y2);
		add (Line);
	}
}	
	
