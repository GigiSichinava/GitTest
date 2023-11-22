import acm.program.ConsoleProgram;

public class Problem29 extends ConsoleProgram{
	public void run(){
		
		int n = readInt ("Enter your number: ");
		println(fibonacciNumber(n)); 
	}
		
		private int fibonacciNumber(int n){
			 if ( n == 1 ){
				 return 0;
			 }
			 
		int a = 0, b = 1;
		for (int i = 3; i <= n; i++){
			int c = a + b;
			a = b;
			b = c;	
		}
		
		return b;
	
	}
}
