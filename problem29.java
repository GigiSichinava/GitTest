import acm.program.ConsoleProgram;

public class problem29 extends ConsoleProgram{
	public void run(){
		
		int n = readInt ("Enter your number: ");
		println(fibonacciNumber(n)); 
	}
		
		private int fibonacciNumber(int n){
			
		int a =0, b = 1;
		for (int i = 3; i <= n; i++){
			int c = a + b;
			a = b;
			b = c;	
		}
		
		return b;

		
	}
}
