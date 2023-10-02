import stanford.karel.*;

	public class problem05 extends Karel {
		public void run() {
			while (frontIsClear()){
				putBeeper();
			if (beepersPresent()) {
				move();
			} else{
				putBeeper();
				move();
			}
		}		
			putBeeper();
	}
}
				
			
			
		
			
		
