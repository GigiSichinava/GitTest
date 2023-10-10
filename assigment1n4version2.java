import stanford.karel.SuperKarel;

public class assigment1n4version2 extends SuperKarel{
	public void run(){
			
		turnLeft();
		while(frontIsClear()){
			move();
		}
		turnRight();
		turnRight();
		
		while(frontIsClear()){
			turnLeft();
			move();
			turnRight();
			move();
			move();
			turnLeft();
			turnRight();
			
			
			
		}
		
			
		
		
	}
	

}
