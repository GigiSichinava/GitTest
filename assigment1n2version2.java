import stanford.karel.SuperKarel;

public class assigment1n2version2 extends SuperKarel {
	public void run(){
		
		fillLastColumn();
		
		while(frontIsClear()){
		getToTheStartingPosition();
		fillColumn();
		getToTheStartingPosition();
		changeColumn();		
		}
		
	}


	private void fillLastColumn() {
		while(frontIsClear()){
			move();
		}
		getToTheStartingPosition();
		fillColumn();
		turnAround();
		while(frontIsClear()){
			move();
		}
		if(frontIsBlocked()){
			turnAround();
		}
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
			if(noBeepersPresent()){
				putBeeper();
				move();
			}else{
				move();	
			}
		}
		 if(noBeepersPresent()){
			 putBeeper();
		 }
		 turnLeft();
	}
	
	
	
	private void changeColumn() {
		while(frontIsClear()){
			move();
			turnLeft();
			move();
			turnRight();
		}
		
		while(frontIsBlocked()){			
			turnRight();				 
			if(leftIsClear()){
				move();					
			}
			turnLeft();
			if(frontIsClear()){
				move();
			}
									
			
		}
		
	}

}









