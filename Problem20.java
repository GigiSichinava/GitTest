import acm.program.ConsoleProgram;

public class Problem20 extends ConsoleProgram{
	public void run(){
		
		int n = readInt("Enter your number: ");				
		int sum = 0;
			
		for (int i = 0; i < n; i++){
			int k = i + 1;
			int num = readInt ("Enter number " + k + ": ");
			sum += num;	
		}
		
		println("sum: " + sum);
		
	}
}
