import stanford.karel.SuperKarel;

public class assigment1n3 extends SuperKarel{
	public void run (){
		
		
	while(frontIsClear()){
		
		
		while (frontIsClear()){
			putBeeper();
			move();
			if(frontIsClear()){
				move();
			}else{
				turnAround();
			}			
		}
			
		
			
		
		while(frontIsClear()){
			move();
		}
		turnRight();
		if(frontIsClear()){
			move();
		}
		if(frontIsClear()){
			turnRight();
		}
		
		
		while(frontIsClear()){
			move();
			putBeeper();
			if(frontIsClear()){	
				move();
			}else{
				turnAround();
			}		
		}
		
		
		
		while(frontIsClear()){
			move();
		}
		turnRight();
		if(frontIsClear()){
			move();
		}
		if(frontIsClear()){
			turnRight();
		}
		
		
		}	
	}
}
