import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Practice extends GraphicsProgram {
	public void run() {

		int x = getWidth() / 8;
		int y = getHeight() / 8;
		GRect rect = new GRect(x, y);
		
		for (int rows = 0; rows < 8; rows++){
			for(int colls = 0; colls < 8; colls++){
				add(rect, x * rows, y);
			}
		}
	}
}