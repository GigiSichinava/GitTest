import stanford.karel.SuperKarel;

public class assigment1n3 extends SuperKarel{
	public void run (){
		
		
	while(frontIsClear()){
		
		
		while (frontIsClear()){
			putBeeper();
			move();
			if(frontIsClear()){
				move();
			}			
		}
			turnAround();
		
			
		
		while(frontIsClear()){
			move();
		}
		turnRight();
		if(frontIsClear()){
			move();
		}	
			turnRight();
		
		
		
		while(frontIsClear()){
			move();
			putBeeper();
			if(frontIsClear()){	
				move();
			}		
		}
			turnAround();
		
		
		while(frontIsClear()){
			move();
		}
		turnRight();
		if(frontIsClear()){
			move();
		}	
			turnRight();
		
		
		
		}	
	}
}
