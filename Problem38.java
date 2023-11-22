
import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Problem38 extends ConsoleProgram {
	
	
	private RandomGenerator random;
	
	private static final int START_BALANCE = 1000;
	
	public void run() {
		random = RandomGenerator.getInstance();
		int balance = START_BALANCE;
		while (balance > 0) {
			println("you have " + balance + "$");
			int bet = readInt("enter bet amount: ");
			if (bet > balance) {
				println("not enough money, try again.");
				continue;
			}
			int number = readInt("enter number: ");
			balance += result(number, bet);
		}
	}
	
	private int result(int chosenNumber, int bet) {
		int spinnedNumber = spin();
		println(".... " + spinnedNumber);
		if (spinnedNumber == chosenNumber) {
			println("you won!");
			return 35 * bet;
		}
		println("you lose!");
		return -bet;
	}
	
	private int spin() {
		return random.nextInt(0, 36);
		// return random.nextInt(37);
	}
}