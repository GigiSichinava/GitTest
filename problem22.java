import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class problem22 extends GraphicsProgram{
	
	private static final int NUMBER_OF_ROWS = 8;
	private static final int NUMBER_OF_COLUMNS = 8;
		
	public void run(){
		int sqSize =  getHeight() / NUMBER_OF_ROWS;
		for (int i = 0; i < NUMBER_OF_ROWS; i++){
			for (int j = 0; j < NUMBER_OF_COLUMNS; j++){
				double x = j * sqSize;
				double y = i * sqSize;
				GRect sq = new GRect (x, y, sqSize, sqSize);
				int c = i + j;
				if( c % 2 == 0){
					sq.setFilled(false);
				}else{
					sq.setFilled(true);
				}
				add(sq);
			}
			
		}
		
		
		
	}
}
