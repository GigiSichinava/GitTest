import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Practice extends GraphicsProgram{
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	private static final int R = 5;
	private static final int NUM = 100;
	private GOval oval;
	
	public void run(){
		GOval[] myArray = new GOval[NUM];
		for(int i = 0; i < NUM; i++){
			myArray[i] = new GOval(2 * R, 2 * R);
			myArray[i].setFilled(true);
			add(myArray[i],(rgen.nextInt(0, getWidth() - 2 * R)), 0);
		}
		
	}
}