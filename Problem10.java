


import stanford.karel.Karel;

public class Problem10 extends Karel {
	public void run() {
		move();
		while (beepersPresent()) {
			move();
			subtractAndReturnBeepers();
		}
	}

	private void subtractAndReturnBeepers() {
		subtractBeepers();
		moveTwice();
		turnAround();
		returnBeepers();
		move();
		putBeeper();
		moveTwice();
		turnAround();
	}

	private void returnBeepers() {
		while (beepersPresent()) {
			pickBeeper();
			moveTwice();
			putBeeper();
			turnAround();
			moveTwice();
			turnAround();
		}
	}

	private void moveTwice() {
		move();
		move();
	}

	private void subtractBeepers() {
		while (beepersPresent()) {
			pickBeeper();
			moveTwice();
			putBeeper();
			turnAround();
			for (int i = 0; i < 3; i++) {
				move();
			}
			pickBeeper();
			turnAround();
			move();
		}
	}

	private void turnAround() {
		turnLeft();
		turnLeft();
	}
}