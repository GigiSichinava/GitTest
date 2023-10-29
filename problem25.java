import acm.program.ConsoleProgram;

public class problem25 extends ConsoleProgram{
	public void run(){
		int n = readInt("Enter n: ");
		int m = readInt("Enter m: ");
		
		int gcd = gcd(n, m);
		println("GCD is: " + gcd);
		
	}

	private int gcd(int n, int m) {
		for (int i = Math.min(n, m); i >= 1; i--) {
			if(n % i == 0 && m % i == 0)  //&& - and
			return i;
		}
		return -1;
	}
}
