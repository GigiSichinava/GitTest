import stanford.karel.*;

public class assigment1n4 extends SuperKarel {
	public void run(){
		fillRow();
		findCentre();
		putBeeper();		
	}


	private void fillRow() {
		// fill the first row with beepers except first and last corners
		while(frontIsClear()){
			move();
			putBeeper();
		}
		if(beepersPresent()){
			pickBeeper();
		}
		turnAround();
		if(frontIsClear()){
			move();
		}
		while(beepersPresent()){
			move();
		}
		turnAround();
		move();
	}		

	private void findCentre() {
		// find center of the first row
	while(beepersPresent()){
		
		while(beepersPresent()){
			move();
		}
		turnAround();
		move();
		pickBeeper();
		move();
		}
		//make karel ready to put beeper in  the center	
			turnAround();
			move();
	}

}


	
	
	
	
	

