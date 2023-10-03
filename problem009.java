	import stanford.karel.*;

public class problem009 extends SuperKarel {
	public void run(){
		move();
		Fill();
	}
		
		
		private void Fill(){
			
		
		
		
		while(beepersPresent()){
		pickBeeper();
		move();
		move();
		putBeeper();
		move();
		putBeeper();
		turnAround();
		move();
		move();
		move();
		turnAround();
		}
		move();
		move();
		move();
		
		while(beepersPresent()){
			pickBeeper();
			turnAround();
			move();
			move();
			move();
			putBeeper();
			turnAround();
			move();
			move();
			move();
	
		}
		turnAround();
		move();
		move();
		move();
		turnAround();
		
	move();
		}		
}













/*კარელმა უნდა გაამრავლოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე
m ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n * m ბრილიანტი. ჩათვალეთ, რომ
კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს. */