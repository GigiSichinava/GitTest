import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram {
	public void run() {
		int num1 = readInt("Enter the first number: ");
		int num2 = readInt("Enter the second number: ");

		int a = num1;
		int b = num2;

		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}

		int gcd = a;

		println("GCD is: " + gcd);
	}

}
