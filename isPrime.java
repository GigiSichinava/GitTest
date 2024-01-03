import acm.program.ConsoleProgram;

public class isPrime extends ConsoleProgram {
	public void run() {

		while (true) {
			int x = readInt("Check if number is prime: ");
			println(isPrime(x));
		}

	}

	private boolean isPrime(int x) {
		if (x == 1) {
			println(x + " is not prime, nor complex number.");
			return false;
		}
		
		if (x == 0) {
			return true;
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