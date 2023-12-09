import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class ChekerBoard extends GraphicsProgram {

	private static final int NROWS = 8;
	private static final int NCOLS = 8;

	public void run() {
		createBoard();
		sayHi();
	}

	private void createBoard() {
		int sqSize = getHeight() / NROWS;
		for (int i = 0; i < NROWS; i++) {
			for (int j = 0; j < NCOLS; j++) {
				int x = sqSize * j;
				int y = sqSize * i;
				GRect rect = new GRect(sqSize, sqSize);
				add(rect, x, y);
				if((j + i) % 2 != 0){
					rect.setFilled(true);
				}
			}
		}
	}

	private void sayHi() {
			GLabel label = new GLabel ("PLAYBOI DROP!", getWidth() / 1.5, getHeight() / 2);
			add(label);
	}
}