import stanford.karel.*;

	public class problem05 extends Karel {
		public void run() {
			while(frontIsClear()){
			if (beepersPresent()){
				move();
			}else	{
				putBeeper();
			}
		}
	}	
}			
			
			
		
			
		
