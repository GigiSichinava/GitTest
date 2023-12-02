import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Practice extends GraphicsProgram{
	
	private static final int numRows = 8;
	private static final int numColl = 8;
	private GRect rect;
	
	public void run(){
		createBoard();
	}
	private void createBoard(){
		
		
		int R = getHeight() / numRows;
		for(int i = 0; i < numRows; i++){
			for(int j = 0; j < numColl; j++){
				rect = new GRect(R, R);
				add(rect, R * i, R * j);
				if((i + j) % 2 == 1){
					rect.setFilled(true);
			}
			
			}
		}
		
	}
}