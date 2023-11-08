import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class problem37 extends ConsoleProgram {

	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {

		while (true) {

			int a = readInt("Enter your number here: ");

			// check if number is between 0 and 36
			if (a > 36 || a < 0) {
				println("Error number!");
				println();
			} else {
				// if number is between 0 and 36
				int randomNumber = rgen.nextInt(0, 36);
				println("Game has chosen: " + randomNumber);

				// if our number equals to game's number we win
				if (randomNumber == a) {
					println("You have won!");
					println();
				} else {
					// if our number doesn't equal to game's number we win
					println("You have lost");
					println();
				}
			}
		}
	}
}
