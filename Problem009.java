import stanford.karel.*;

public class Problem009 extends SuperKarel{
	public void run(){
	move();
	while(beepersPresent()){
		pickBeeper();
		move();
		while(beepersPresent()){
			pickBeeper();
			move();
			putBeeper();
			move();
			putBeeper();
			turnAround();
			move();
			move();
			turnAround();
		}
		turnAround();
		move();
		turnAround();
		if(beepersPresent()){
			move();
			move();
			move();
			while(beepersPresent()){
				pickBeeper();
				turnAround();
				move();
				move();
				putBeeper();
				turnAround();
				move();
				move();
		}
		turnAround();
		move();
		move();
		move();
		turnAround();
	}
}
	move();
	move();
	move();
	while(beepersPresent()){
		pickBeeper();
		turnAround();
		move();
		move();
		putBeeper();
		turnAround();
		move();
		move();
	}
	
	turnAround();
	move();
	move();
	turnAround();
	
	while(beepersPresent()){
		pickBeeper();
		}
	}
}	
		
	
		
		
			
			

	
	
	
