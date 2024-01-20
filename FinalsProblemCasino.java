import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class FinalsProblemCasino extends ConsoleProgram {

	private static final int N_TRIES = 1000;
	private static final int MIN_NUM = 0;
	private static final int MAX_NUM = 36;
	private int startingMoney = 100;
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {

		while (N_TRIES > 990) {
			int guess = readInt("Write your guess: ");
			int moneyInput = readInt("Put money: ");
			int spinResult = rgen.nextInt(MIN_NUM, MAX_NUM);
			println("Casino's result is: " + spinResult);
		
			if(spinResult == guess ){
				startingMoney += startingMoney * 36;
			}else{
				startingMoney -= moneyInput;
			}
			println(startingMoney);

		}
		
	
	
	}
}
