import acm.program.ConsoleProgram;

public class problem24 extends ConsoleProgram{
	public void run(){
		
		int num = readInt ("Enter your number: ");
		int numDivisiors = numberOfDivisors(num);
		println(numberOfDivisions);
	}

	private void numberOfDivisors(int n) {
		int num = 0;
		for(int i = 1; i <= n; i++){
			if (n % i == 0) {  //% - reminder
				num += 1;
			}
		
		}
	}
}

