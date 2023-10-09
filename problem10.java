import stanford.karel.*;
	
	public class problem10 extends SuperKarel{
	public void run(){
		
		move();
		int m=0;
		int n=0;
		
		while(beepersPresent()){
			pickBeeper();
			m++;
		}
		move();
		while(beepersPresent()){
			pickBeeper();
			n++;
		}
		move();
		for (int i=0; i < m / n; i++){
			putBeeper();	
		}
		move();
		
	}

}
