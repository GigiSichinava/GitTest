import acm.program.ConsoleProgram;

public class Problem28 extends ConsoleProgram {

	private static final int SENTINEL = -1;

	public void run() {

		int numberOfOdds = 0;

		while (true) {

			int odd = readInt("Enter your number: ");
			if (odd == SENTINEL) {
				break;
			}

			if (odd % 2 == 0) {
				numberOfOdds++;
			}
		}

		print("Number of odds: " + numberOfOdds);
	}
}
