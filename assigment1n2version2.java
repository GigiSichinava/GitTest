import stanford.karel.SuperKarel;

public class assigment1n2version2 extends SuperKarel {
	public void run(){
		
		getToTheStartingPosition();
		fillColumn();
		getToTheStartingPosition();
//		changeColumn();
//		fillColumn();
//	
		
	}

	

	private void getToTheStartingPosition() {
		turnLeft();
		while(frontIsClear()){
			move();
		}
		if(frontIsBlocked()){
			turnRight();
		}
		
	}
	
	
	
	private void fillColumn() {
		turnRight();
		while(frontIsClear()){
			if(!beepersPresent()){
				putBeeper();
				move();
			}else{
				move();	
			}
		}
		 putBeeper();
	}
	
}
