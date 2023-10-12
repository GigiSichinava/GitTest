import stanford.karel.SuperKarel;

public class assigment1n2version2 extends SuperKarel {
	public void run(){
		
		getToTheStartingPosition();
//		fillColumn();
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
}
