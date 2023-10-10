import stanford.karel.SuperKarel;

public class assigment1n4version2 extends SuperKarel{
	public void run(){
		while(frontIsClear()){
			move();
			turnLeft();
		if(frontIsClear()){	
			move();
			move();
			turnRight();
		}
		
		}	
		
	}
	

}
