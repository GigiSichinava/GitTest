import stanford.karel.SuperKarel;

public class assigment1n1 extends SuperKarel {
	public void run(){
		goToNewspaper();
		takeNewspaper();
		goBackToHome();
		
	}

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
