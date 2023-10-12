import stanford.karel.SuperKarel;

public class assigment1n3version2 extends SuperKarel {
public void run(){
	
	while(!beepersPresent()){
	fillFirstLine();
	changeLine();
	fillSecondLine();
	changeLine();
	}
}
	




private void fillFirstLine() {
		putBeeper();
		if(frontIsClear()){
			move();
		}
		if(frontIsClear()){
			move();
		}
	while(frontIsClear()){
		putBeeper();
		move();
		if(frontIsClear()){
			move();
		if(frontIsBlocked()){
			putBeeper();
		}
		
		}
	}
	
}


private void changeLine() {
	turnAround();
	while(frontIsClear()){
		move();
	}
		turnRight();
		if(frontIsClear()){
			move();
		}		
			turnRight();		
}




private void fillSecondLine() {
	while(leftIsClear()){
	while(frontIsClear()){
		move();
		putBeeper();
		if(frontIsClear()){
			move();		
		}		
	}
	}
}

}













