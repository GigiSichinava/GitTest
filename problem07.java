import stanford.karel.*;

public class problem07 extends SuperKarel{
	public void run(){
		
		while(frontIsClear()){
			if(!beepersPresent()){
				putBeeper();
				move();
			}else{
				move();	
			}
		}
		 putBeeper();
	for (int i=0; i < 2; i++){
		turnLeft();
	}
		while(frontIsClear()){
			move();
		}	
		
	for (int i=0; i < 3; i++){
			turnLeft();
	}
		move();
		turnRight();
		
		
		
	}			
}
	