import stanford.karel.*;

public class problem08 extends Karel{
	public void run(){
		int n=0;
		int m=0;
			
		move();
		
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
			
		for (int i=0; i < n-m; i++ );
		putBeeper();
					
	}

}
