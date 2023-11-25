import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram {
	public void run() {

		int n = readInt("Enter n: ");
		int m = readInt("Enter m: ");

		if (n % m == 0 || m % n == 0) {
			if (n >= m) {
				println(m);
			}
			if (n <= m) {
				println(n);
			}
		} else {
			println(i);
		}
	}
}
