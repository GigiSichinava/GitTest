import stanford.karel.*;

public class Problem006 extends SuperKarel{
	public void run(){
		move();
		while(beepersPresent()){
			pickBeeper();
			move();
			move();
			putBeeper();
			turnAround();
			move();
			move();
			turnAround();						
		}
		
		move();
		
		while(beepersPresent()){
			pickBeeper();
			move();
			putBeeper();
			turnAround();
			move();
			turnAround();
		}
				move();	
		
	}

}
