import acm.program.ConsoleProgram;

public class Problem49 extends ConsoleProgram {
	public void run() {
		String num = readLine("Enter Number: ");
		int result = 0;

		for (int i = 0; i < num.length(); i++) {
			int n = num.charAt(i) - '0';
			result = result * 10 + n;
		}

		print(result);
	}
}
