import stanford.karel.*; ;

public class Problem7 extends SuperKarel {
	
	public void run() {
		
		if (!beepersPresent()){
			putBeeper();
				
			}
		while(frontIsClear()){
			move();
			if (!beepersPresent()){
			putBeeper();
			}
		}
		
		}
		
	}


