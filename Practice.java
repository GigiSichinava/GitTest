import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Practice extends GraphicsProgram{
	
	private static final int N_COLS = 9;
	private static final int N_ROWS = 9;
	
	public void run(){
		
		setSize(500, 500);
		
		for(int i = 0; i < N_COLS; i++){
			for(int j = 0; j < N_ROWS; j++){
				int rectWidth = getWidth() / N_COLS;
				int rectHeight = getHeight() / N_ROWS;
				GRect rect = new GRect(rectWidth, rectHeight);
				add(rect, rectWidth * i, rectHeight * j);
			}
		}
		
	}
}