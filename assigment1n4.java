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
		pickBeeper();
		while(frontIsClear()){
			
			
			
		}
		
	}
	
	
	private void fillRow(){
		while(frontIsClear()){
			putBeeper();
			move();
		}
			putBeeper();
			turnAround();
		while(frontIsClear()){
			move();
		}
			turnAround();
		}
	
	
}
