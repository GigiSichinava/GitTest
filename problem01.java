import stanford.karel.Karel;

	public class problem01 extends Karel {
		public void run(){
			while (frontIsClear()) {
				putBeeper();
				move();
				putBeeper();
			}
			
			
		}
}
	

