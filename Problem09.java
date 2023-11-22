	import stanford.karel.*;

	public class Problem09 extends SuperKarel {
		public void run(){
			move();
			int n=0;
			int m=0;
			
		while(beepersPresent()){
			pickBeeper();
			n++;
		}
		 	move();
		 while(beepersPresent()){
			 pickBeeper();
			 m++;
		 }
		 	move();
		 for (int i=0; i < m * n; i++){
		 putBeeper();
		 					
		}
		 	move();
	}
}
