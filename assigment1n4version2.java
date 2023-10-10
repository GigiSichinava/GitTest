import stanford.karel.SuperKarel;

public class assigment1n4version2 extends SuperKarel{
	public void run(){
			while(frontIsClear()){
				turnLeft();
				move();
				turnRight();
				if(frontIsClear()){
				move();
				}else{
				move();
				}
			}
		
						
	}
}	
	


