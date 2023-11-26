import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram {
	public void run() {

		while (true) {

			boolean isPrime = true;
			int number = readInt("Ur number");

			for (int i = 1; i < Math.sqrt(number); i++) {
				if (number % i == 0) {
					isPrime = false;
				} else {
					isPrime = true;
				}
			}
			println(isPrime);
		}
	}
}