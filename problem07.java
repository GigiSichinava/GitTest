import stanford.karel.SuperKarel; ;

public class problem07 extends SuperKarel {
	
	public void run() {
		
		if (!beepersPresent()){
			putBeeper ();
		}
		while(frontIsClear()){
			fill();
		if(frontIsClear()){
				move();
		}
			putBeeper();
			turnRight();
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

