import stanford.karel.SuperKarel;

public class assigment1n3 extends SuperKarel{
	public void run (){
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
		move();
		turnRight();
		
		while(frontIsClear()){
			move();
			putBeeper();
			move();
			if(frontIsClear()){
				move();
				
			}
		}
		
		
		
	}
}
