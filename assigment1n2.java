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