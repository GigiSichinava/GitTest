import acm.graphics.GLine;
import acm.program.GraphicsProgram;

	public class problem13 extends GraphicsProgram {
		public void run(){
		drawMidLine1();
	
	}
	
	private void drawMidLine1() {
		double x1 = 0;
		double y1 = getHeight() / 2;
		double x2 = getWidth();
		double y2 = y1;
		GLine Line = new GLine(x1, y1, x2, y2);
		add (Line);
	}

}
