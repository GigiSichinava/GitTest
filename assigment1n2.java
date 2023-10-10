import stanford.karel.SuperKarel;

public class assigment1n2 extends SuperKarel {
	public void run() {
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
		while(frontIsBlocked()){
			turnRight();
			move();
			turnLeft();
			move();
		}
		turnAround();
		
		
		
		
	}
	
	
	

}
