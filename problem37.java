import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class problem37 extends ConsoleProgram {
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run(){
		
		int a = readInt ("Enter your number here: ");

		int randomNumber =  rgen.nextInt(0, 36);
//		println(randomNumber);
	
		if (randomNumber == a){
			println("You won!");
		}
	
	}
}
