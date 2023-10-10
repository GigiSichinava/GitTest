import stanford.karel.*;

public class assigment1n4 extends SuperKarel {
	public void run(){
		
	//help Karel to find middle of the row	
		findCentre();
		putBeeper();				
	}
	
	private void findCentre(){
		fillRow();
		takeBeepersFromSidesToCentre();		
	}
	
	private void takeBeepersFromSidesToCentre(){
		//start to take side 1
		while(frontIsClear()){
			move();
		}
			pickBeeper();
			turnAround();
			
			
		while(frontIsClear()){
			move();
		}
			pickBeeper();
			turnAround();
			move();
		// finish to take side 2			
		
			while(beepersPresent()){
			move();
		}
			turnAround();
			move();
			pickBeeper();
			
			
			
			
		}
		
		
	
	
	
	private void fillRow(){
		while(frontIsClear()){
			move();
			putBeeper();
		}
			pickBeeper();
			turnAround();
		while(beepersPresent()){
			move();
			
		}
			
	}
	
	
	
	
	
}
