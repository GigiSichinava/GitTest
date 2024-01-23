import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class FirstProject extends GraphicsProgram{
	
	private static final int N_ROWS = 10;
	private static final int N_COLS = 10;
	private GRect rect;
	
	public void init(){
		setSize(900,900);
	}
	
	public void run(){
		createGrid();
		createBroski();
		createMovement();
	}

	private void createGrid() {
		for(int i = 0; i < N_ROWS; i++){
			for(int j = 0; j < N_COLS; j++){
				int rectWidth = getWidth() / N_COLS;
				int rectHeight = getHeight() / N_ROWS;
				rect = new GRect(rectWidth, rectHeight);
				
				add(rect, j * rectWidth, i * rectHeight);
			}
		}
	}

}
