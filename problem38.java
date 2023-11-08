import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class problem38 extends ConsoleProgram {
	
	private RandomGenerator random;
	
	private static final int SENTINEL = -1;
	
	public void run() {
		random = RandomGenerator.getInstance();
		while (true) {
			int chosenNumber = readInt("enter number 0-36: ");
			if (chosenNumber == SENTINEL) {
				break;
			}
			int randomNumber = getRandomNumber();
			processResult(chosenNumber, randomNumber);
		}
	}
	
	private void processResult(int chosenNumber, int randomNumber) {
		println(".....");
		println(randomNumber);
		if (randomNumber == chosenNumber) {
			println("you win!");
		} else {
			println("you lose!");
		}
	}
	
	private int getRandomNumber() {
		return random.nextInt(0, 36);
	}
	
}