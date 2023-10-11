import stanford.karel.SuperKarel;

public class assigment1n3version2 extends SuperKarel {
public void run(){
	
	while(frontIsClear()){
	fillFirstLine();
	changeLine();
	fillSecondLine();
	changeLine();
	}
	}
	




private void fillFirstLine() {
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
		
		
}



private void fillSecondLine() {
	while(frontIsClear()){
		move();
		putBeeper();
		if(frontIsClear()){
			move();		
		}
		
}
	
	
	
	
	
}





}









