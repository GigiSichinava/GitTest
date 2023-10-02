import stanford.karel.*;

public class problem07 extends Karel{
	public void run(){
		if (noBeepersPresent()){
			putBeeper();
		}
		while(frontIsClear()){
			if(!beepersPresent()){
				putBeeper();
				move();
			}else{
				move();
				
			}
		}
	
		
		
		
		
	}			
}
	