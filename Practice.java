import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Practice extends GraphicsProgram {

	private static final int NROWS = 8;
	private static final int NCOLS = 8;

	public void run(){
		int sqSize = getHeight() / NROWS;
		int X = ( getWidth() - sqSize ) / 2;
		int Y = getHeight() - (8 * sqSize);
		for(int i = 0; i < NROWS; i++){
			for(int j = 0; j < NCOLS; j++){
				GRect rect = new GRect (sqSize, sqSize);
				add(rect, X, Y);
			}
		}
	}
}