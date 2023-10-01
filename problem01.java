import stanford.karel.*;

public class problem01 extends Karel {

    public void run() {
        while (true) {
            putBeeperInRow();
            if (!moveToNextRow()) {
                break; // Stop the loop if there are no more rows
            }
        }
    }

    // Move Karel to the next row
    private boolean moveToNextRow() {
        if (facingEast()) {
            turnLeft();
            if (frontIsClear()) {
                move();
                turnLeft();
                return true; // Moved to the next row
            } else {
                return false; // No more rows to move
            }
        } else {
            turnRight();
            if (frontIsClear()) {
                move();
                turnRight();
                return true; // Moved to the next row
            } else {
                return false; // No more rows to move
            }
        }
    }

    // Put beepers in the current row
    private void putBeeperInRow() {
        while (frontIsClear()) {
            putBeeper();
            move();
        }
        putBeeper(); // Put a beeper in the last block of the row
        turnAround(); // Turn around to prepare for the next row
        while (frontIsClear()) {
            move(); // Move back to the starting position of the next row
        }
        turnAround(); // Turn around to face the next row
    }

    // Turn Karel 180 degrees
    private void turnAround() {
        turnLeft();
        turnLeft();
    }

    // Turn Karel right
    private void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}


			

	
	
	


	





