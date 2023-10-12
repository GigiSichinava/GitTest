import stanford.karel.SuperKarel;

public class assigment1n3version2 extends SuperKarel {
	public void run(){
	
	//with if conditional prevent maps with only one column
	//otherwise fill rows step-by-step in chess principle 
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
		 move();
	   if(frontIsClear()){
	   	 move();
		  if(frontIsBlocked()){
			putBeeper();
		  }
	   }
	  }
	}
		

	}
	
   //make karel to fill the first line of our 'chessboard'
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
			move();
			putBeeper();
			if(frontIsClear()){
				move();		
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













