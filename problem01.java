import stanford.karel.Karel;

	public class problem01 extends Karel {
		public void run(){
			 if (beepersPresent()) {
				move();
			} else{
				putBeeper();
				move();
			}	
			
		}
}
	

