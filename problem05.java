	import stanford.karel.Karel;

	public class problem05 extends Karel {
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
	}
}
