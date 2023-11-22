	import stanford.karel.*;

public class Problem008 extends SuperKarel{
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
		pickBeeper();
		turnAround();
		move();
		turnAround();	
		}
		move();
		
	}
}
