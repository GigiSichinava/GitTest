import stanford.karel.SuperKarel;

public class assigment1n2 extends SuperKarel{
	public void run(){
		
		//fill the first column and then start cycle
		fillColumn();
		
		while(frontIsClear()){
		changeColumn();
		fillColumn();
		}
				
	}
	
	private void fillColumn() {
		turnLeft();
		if(noBeepersPresent()){
			putBeeper();
		}
		while(frontIsClear()){
			if(noBeepersPresent()){
				putBeeper();
				move();
			}else{
				move();	
			}
			if(noBeepersPresent()){
				 putBeeper();
			}
		}
		getToStartingPosition();
	}
	
	
	// pre: top of the column, facing north
	// post: bottom of the column, facing east
	private void getToStartingPosition() {
		turnAround();
		while(frontIsClear()){
			move();
		}
		turnLeft();		
	}

	
	private void changeColumn(){
		for (int i=0; i < 4; i++){
			move();
		}		
	}
	
	
}