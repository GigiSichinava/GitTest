	import stanford.karel.Karel;

	public class problem01 extends Karel {
		public void run(){
			for (int i=0; i < 4; i++) {
				move();				
			}
			for (int i=0; i < 10; i++) {
				pickBeeper();	
			}
			move();
			for (int i=0; i < 10; i++) {
				putBeeper();
				
			}
					
		}
}
