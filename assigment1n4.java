import stanford.karel.*;

public class assigment1n4 extends SuperKarel {
	public void run(){
	//make Karel to put beeper in the center of the first street.
		fillRow();
		findCentre();
		finishJob();		
	}


	private void fillRow() {
		/* fill the first row with beepers except first and last corners
		 * code considers 1x1 map also */
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
		if(frontIsClear()){
			move();
		}
	}		

	
	private void findCentre() {
		// find center of the first row
		
	while(beepersPresent()){
		
		while(beepersPresent()){
			move();
		}
		turnAround();
		if(frontIsClear()){
			move();
		}
		if(beepersPresent()){
			pickBeeper();
		}
		if(frontIsClear()){
			move();
		}
	}
			//make Karel ready to put beeper in  the center	
		turnAround();
		if(frontIsClear()){
		move();
		}
	}
	
	
	private void finishJob(){
		putBeeper();
	}

}


	
	
	
	
	

