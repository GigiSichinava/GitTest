import stanford.karel.SuperKarel;

public class assigment1n2 extends SuperKarel {
	public void run() {									
	//	startPosition();
	while(beepersInBag()){	
		fillColumn();
		moveToTheNextColumn();
		fillColumn();
	}
	}

	/*
	private void startPosition() {
		// make karel ready to start
		turnLeft();
		while(frontIsClear()){
			move();
		}
		turnRight();
	}
	*/

	private void fillColumn() {
		
		// fill whole column with beepers
			turnLeft();
			
		while(frontIsClear()){
			if(!beepersPresent()){
				putBeeper();
				move();
			}else{
				move();	
			}
		}
	}
	
	
	private void moveToTheNextColumn() {
		turnRight();
		while(frontIsClear()){
			move();
			turnLeft();
			move();
			turnRight();
		}
		 
		 while(frontIsBlocked()){			//bolo taghze roca gadavalt chamosvlisas front isev blockdaaa!!
			turnRight();				 //xelit chawerit tu sheidzleba svetidan svetze gadasvla unda vikixo
			move();					//tu tagebi yvelgan ertnairia mza private void gavuketot moveToTheNextColums-s
			turnLeft();
			move();
		 }		 
		 	
		 // back to the bottom of the column
		 if(!beepersPresent()){
		 		putBeeper();
		 	}
		 		turnRight();		 
		 while(frontIsClear()){
			move(); 
		 }
		 turnLeft();				
		
	}	
	

}



//while(frontIsBlocked()){			
//turnRight();				 
//if(frontIsClear()){
//	move();					
//}
//turnLeft();
//if(frontIsClear()){
//	move();
//}

