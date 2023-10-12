import stanford.karel.SuperKarel;

public class assigment1n3version2 extends SuperKarel {
public void run(){
	
	if(frontIsClear()){
	while(frontIsClear()){
	fillFirstLine();
	changeLine();
	fillSecondLine();
	changeLine();
	}
	}else{
		turnLeft();
		while(frontIsClear()){
			putBeeper();
			if(frontIsClear()){
				move();
			}
			if(frontIsClear()){
				move();
			}
		}
	}
	
	

}
	




private void fillFirstLine() {
		if(noBeepersPresent()){		
		putBeeper();
		}
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
	if(frontIsBlocked()){
		turnAround();
	}
	while(frontIsClear()){
		move();
	}
		if(frontIsBlocked()){
			turnRight();
		}
		if(frontIsClear()){
			move();
			turnRight();
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













