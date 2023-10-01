import stanford.karel.*;

public class problem01 extends Karel {

    public void run() {
        while (true) {
            putBeeper(); // Place a beeper on the current block
            if (frontIsClear()) {
                move(); // Move to the next block if the front is clear
            } else {
                break; // If the front is blocked, stop the loop
            }
        }
    }
}

			

	
	
	


	





