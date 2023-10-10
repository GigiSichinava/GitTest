import stanford.karel.*;

public class assigment1n4 extends SuperKarel {
	public void run(){
		fillRow();
		
		
		
	}

	private void fillRow() {
		// fill the first row with beepers
		while(frontIsClear()){
			move();
			putBeeper();
		}
		pickBeeper();
		turnAround();
		move();
		while(beepersPresent()){
			move();
		}
		turnAround();
		move();
	}		
}
	
	
	
	
	

