import stanford.karel.*;

	public class problem04 extends Karel {
		public void run(){
			while (frontIsClear()){
				putBeeper();
				move();
			}
			putBeeper();
		}
	}	
