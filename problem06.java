import stanford.karel.*;

	public class problem06 extends Karel {
		public void run(){
			move();
			while(beepersPresent()){
				pickBeeper();
			}
			move();
			while(beepersPresent()){
				pickBeeper();
			}
			move();
			while (beepersInBag()){
				putBeeper();
			}	
		}	 
	}	
	
	
	
