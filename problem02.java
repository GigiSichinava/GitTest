import stanford.karel.*;

public class problem02 {
	public void run(){
	for (int i=0; i < 4; i++){
		move();
	}
	for (int i=0; i < 10; i++){
		pickBeeper();
	}
		move();
	for (int i=0; i < 10; i++){
		putBeeper();
	}		
	}
