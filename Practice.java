import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Practice extends GraphicsProgram{
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int N_COLS = 9;
	private static final int N_ROWS = 9;
	
	public void run(){
		
		setSize(500, 500);
		int rectWidth = getWidth() / N_COLS;
		int rectHeight = getHeight() / N_ROWS;
		
		int ovalWidth = getWidth() / N_COLS - 2;
		int ovalHeight = getHeight() / N_ROWS - 2;
		
		for(int i = 0; i < N_COLS; i++){
			for(int j = 0; j < N_ROWS; j++){
				
				GRect rect = new GRect(rectWidth, rectHeight);
				add(rect, rectWidth * i, rectHeight * j);
			}
		}
		
		GOval oval1 = new GOval(ovalWidth, ovalHeight);
		oval1.setFilled(true);
		oval1.setColor(rgen.nextColor());
		add(oval1);
		
		GOval oval2 = new GOval(ovalWidth, ovalHeight);
		oval2.setFilled(true);
		oval2.setColor(rgen.nextColor());
		add(oval2, rectWidth, rectHeight);	
	}
}