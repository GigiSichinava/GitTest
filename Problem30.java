import acm.program.ConsoleProgram;

public class Problem30 extends ConsoleProgram {
	public void run() {

		int n = readInt("Enter number: ");

		int reversedN = reverse(n);
	}

	private int reverse(int n) {

		while (n != 0) {
			int reversedN = 0;
			int lastDigit = n % 10;
			n /= 10;
			print(lastDigit);
			reversedN = reversedN * 10 + lastDigit;
		}

		return 0;
	}

}
