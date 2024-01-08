import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Practice extends GraphicsProgram{

	private static final int R = 3;
	private  static final int NUM = 500;
;
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void  run(){
		
		setBackground(Color.BLUE);
		GOval[] ovals = new GOval[NUM];
		for(int i = 0; i < NUM; i++){
			ovals[i] = new GOval(R, R);
			ovals[i].setFilled(true);
			ovals[i].setColor(Color.WHITE);
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