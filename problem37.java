import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class problem37 extends ConsoleProgram {
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run(){
		
		while(true){
		int a = readInt ("Enter your number here: ");

		int randomNumber =  rgen.nextInt(0, 36);
		println("Game has chosen: " + randomNumber);
	
		if (randomNumber == a){
			println("You have won!");
		}
		else
			println("You have lost");
	
	}
	}
}
