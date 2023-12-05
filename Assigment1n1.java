import stanford.karel.SuperKarel;

public class Assigment1n1 extends SuperKarel {
	public void run(){
		goToNewspaper();
		takeNewspaper();
		goBackToHome();			
	}

	// pre: stands on 3x4, facing east
	// post: stands on 6x3, facing east
	private void goToNewspaper() {
		move();
		move();
		turnRight();
		move();
		turnLeft();
		move();	
	}
	
	private void takeNewspaper(){
		pickBeeper();
	}
	
	// pre: stands on 6x3, facing east
	// post: stands on 3x4, facing east
	private void goBackToHome(){
		turnAround();
		move();
		turnRight();
		move();
		turnLeft();
		move();
		move();	
		turnAround();
		}
	
}
