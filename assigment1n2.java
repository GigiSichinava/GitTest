import stanford.karel.SuperKarel;

public class assigment1n2 extends SuperKarel {
	public void run() {
		
		// gavasworot kareli
		turnLeft();
		while(frontIsClear()){
			move();
		}
		turnRight();
		
		
		
		fillColumn();
		moveToTheNextColumn();		
	}

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
				
		
		
		
	}
	
	
	

}
