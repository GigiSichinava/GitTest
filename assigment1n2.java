import stanford.karel.SuperKarel;

public class assigment1n2 extends SuperKarel{
	public void run(){
		
		while(frontIsClear()){
		fillColumn();
		changeColumn();
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
		move();
		move();
		move();
		move();
		
		
		
	}
	
	
		
}