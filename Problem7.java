import stanford.karel.*; ;

public class Problem7 extends SuperKarel {
	
	public void run() {
		
		if (!beepersPresent()){
			putBeeper ();
		}
		while(frontIsClear()){
			move();
			turnRight();
			fill();
		}
	
	
	
	}
		private void fill() {
		while(frontIsClear()){
			move();
			if (!beepersPresent()){
			putBeeper();
			}
		}
			turnLeft();
			turnLeft();
		while(frontIsClear()){
			move();
		}
		turnRight();
		
		
		}
	}


