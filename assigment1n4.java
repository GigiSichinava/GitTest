import stanford.karel.*;

public class assigment1n4 extends SuperKarel {
	public void run(){
		fillRow();
		FindCentre();
		
		
	}

	private void fillRow() {
		// fill the first row with beepers
		while(frontIsClear()){
			move();
			putBeeper();
		}
		pickBeeper();
		turnAround();
		while(beepersPresent()){
			move();
		}
		turnAround();
		move();
	}		
}
	
	
	
	
	

