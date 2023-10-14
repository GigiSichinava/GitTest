import stanford.karel.SuperKarel;

public class assigment1n3 extends SuperKarel {
	public void run(){
	
		//firstly, use if conditional to prevent maps with only one column, even 1x1 map
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
	
	   //make Karel to fill the first line in chessboard style
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

	    //make karel to change rows
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



		//make Karel to fill the second line of our 'chessboard'
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













