import stanford.karel.*;

public class problem07 extends SuperKarel{
	public void run(){
		while(frontIsClear()){
		Fill();
		}
	}
	
		private void Fill(){
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
		
		turnRight();	
		
		if (frontIsClear()){
		move();
		turnRight();
		}
	}
}		
				

	