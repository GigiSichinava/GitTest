import stanford.karel.SuperKarel;

public class assigment1n3version2 extends SuperKarel {
public void run(){
	
	fillFirstLine();
	//changeLine();
	//fillSecondLine();	
	
	}

private void fillFirstLine() {
	while(frontIsClear()){
		putBeeper();
		move();
		if(frontIsClear()){
			move();
		if(frontIsBlocked()){
			putBeeper();
		}
		}
	}
	
}
}
