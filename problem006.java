import stanford.karel.*;

public class problem006 extends SuperKarel{
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
			
			
		}
		
		
	}

}
