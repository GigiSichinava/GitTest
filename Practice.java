import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Practice extends GraphicsProgram{

	private static final int R = 5;
	private  static final int NUM = 100;
;
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void  run(){
		GOval[] ovals = new GOval[NUM];
		for(int i = 0; i < NUM; i++){
			ovals[i] = new GOval(R, R);
			ovals[i].setFilled(true);
			add(ovals[i], rgen.nextInt(0,getWidth()), 0);
		}
	}
}