import stanford.karel.*;

public class problem0006 extends SuperKarel{
	public void run(){
		move();
		while(beepersPresent()){
			pickBeeper();
			move();
			move();
			putBeeper();
			move();
			putBeeper();
			turnAround();
			move();
			move();
			move();
			turnAround();
		}
		move();
		while(beepersPresent()){
			pickBeeper();
			move();
			putBeeper();
			move();
			move();
			putBeeper();
			turnAround();
			move();
			move();
			move();
			turnAround();
		}
		move();
		move();
		move();
		while(beepersPresent()){
			pickBeeper();
			turnAround();
			move();
			move();
			move();
			putBeeper();
			turnAround();
			
			
		}
		
	}
}
