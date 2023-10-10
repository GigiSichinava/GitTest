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
		
		
	}
}
