import acm.program.ConsoleProgram;

public class problem20 extends ConsoleProgram{
	public void run(){
		
		int n = readInt("Enter your number: ");		
		
			int sum = 0;		
		for (int i = 0; i < n; i++){
			int num = readInt ("Enter number" + i + ":");
			
			sum += num;	
		}
		println("sum: " + sum);
		
	}
}
