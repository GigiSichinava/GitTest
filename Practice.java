import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Practice extends GraphicsProgram {
	
	private static final int NUMBER_OF_ROWS = 8;
	private static final int NUMBER_OF_COLUMNS = 8;

	
	public void run() {
		int rectSize = getHeight() / NUMBER_OF_ROWS;
		for(int i = 0; i < NUMBER_OF_ROWS; i++){
			for(int j = 0; j < NUMBER_OF_ROWS; j++){
				double x = i * rectSize;
				double y = j * rectSize;
				GRect rect = new GRect (x, y, rectSize, rectSize);
				add(rect);
				
			}
		}

		
	}
}