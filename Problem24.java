import acm.program.ConsoleProgram;

public class Problem24 extends ConsoleProgram{
	public void run(){
		
		int num = readInt ("Enter your number: ");
		int numDivisiors = numberOfDivisors(num);
		println(numDivisiors);
	}

	private int numberOfDivisors(int n) {
		int num = 0;
		for(int i = 1; i <= n; i++){
			if (n % i == 0) {  //% - reminder
				num += 1;
			}
		
		}
		return num;
	
	}
}

