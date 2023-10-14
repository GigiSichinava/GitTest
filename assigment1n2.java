import stanford.karel.SuperKarel;

public class assigment1n2 extends SuperKarel{
	public void run(){
		
		fillColumn();
		
		while(frontIsClear()){
		changeColumn();
		fillColumn();
		}
				
	}

	private void fillColumn() {
		turnLeft();
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