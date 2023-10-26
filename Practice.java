import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		 
		int n = readInt ("Enter your number: ");
		int sum = 0;
		
		for ( int i = 0; i <= n; i++ ){
			int k = i + 1;
			int num = readInt ("Your number" + k + ":");
			sum += num;
			
		}
		
		println ("Result: sum");
		
		
		
	}
}
