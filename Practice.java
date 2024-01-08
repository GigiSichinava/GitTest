import java.awt.Color;

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
			ovals[i].setColor(Color.CYAN);
			add(ovals[i], rgen.nextInt(0,getWidth()), rgen.nextInt(0, getHeight()));
		}
		
		while(true){
			for(int i = 0; i < NUM; i++){
				ovals[i].move(0, 5);
				if(ovals[i].getY() > getHeight()){
					add(ovals[i], rgen.nextInt(0,getWidth()), - 2 * R );
				}
			}
			pause(50);
		}
	}
}