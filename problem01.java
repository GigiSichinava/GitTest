import stanford.karel.Karel;

	public class problem01 extends Karel {
		public void run(){
			
			while (frontIsClear()){
			if (beepersPresent()) {
				move();
			} else{
				putBeeper();
				move();
			}
		}		
			putBeeper();
			
			while(frontIsBlocked()){
				turnLeft();
				move();
				turnleft();
			}
	}
}
	
	
	


	





