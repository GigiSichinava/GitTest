import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram {
	public void run() {

		while (true) {
			int x = readInt("Check if number is prime: ");
			println(isPrime(x));
		}

	}

	private boolean isPrime(int x) {
		if (x == 1) {
			println("1 is not prime, nor complex number.");
			return false;
		}
		int checkBefore = (int) Math.sqrt(x);
		for (int i = 2; i <= checkBefore; i++) {
			if (x % i == 0) {
				return false;
			}
		}

		return true;
	}
}