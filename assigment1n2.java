import stanford.karel.SuperKarel;

public class assigment1n2 extends SuperKarel {
	public void run() {									
	//	startPosition();
	while(beepersInBag()){	
		fillColumn();
		moveToTheNextColumn();	
	}
	}

	/*
	private void startPosition() {
		// make karel ready to start
		turnLeft();
		while(frontIsClear()){
			move();
		}
		turnRight();
	}
	*/

	private void fillColumn() {
		
		// fill whole column with beepers
			turnLeft();
			
		while(frontIsClear()){
			if(!beepersPresent()){
				putBeeper();
				move();
			}else{
				move();	
			}
		}
	}
	
	
	private void moveToTheNextColumn() {
		turnRight();
		while(frontIsClear()){
			move();
			turnLeft();
			move();
			turnRight();
		}
		 
		 while(frontIsBlocked()){
			turnRight();
			move();
			turnLeft();
			move();
		 }
		 
		 turnRight();
		 while(frontIsClear()){
			move(); 
		 }
		 turnRight();
				
		
		
		
	}
	
	
	

}
