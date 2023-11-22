import stanford.karel.SuperKarel;

public class Problem11 extends SuperKarel {
	public void run() {
		while (noBeepersPresent()) {
			while (rightIsBlocked()) {
				while (frontIsBlocked()) {
					turnLeft();
				}
				if (noBeepersPresent()) {
					move();
				}
				while (rightIsClear()) {
					turnRight();
					if (noBeepersPresent()) {
						move();
					}
				}

			}
		}
	}
}
