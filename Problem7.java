import stanford.karel.*; ;

public class Problem7 extends SuperKarel {
	
	public void run() {
		
		while (frontIsClear()){
			if(!beepersPresent()){
				putBeeper();
				move();
				
			}
		}
		
	}

}
