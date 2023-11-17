	import stanford.karel.Karel;

	public class Problem05 extends Karel {
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
