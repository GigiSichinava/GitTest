import acm.program.ConsoleProgram;

public class problem30 extends ConsoleProgram {
	public void run(){
		
		int n = readInt ("Ener ur numb: ");
		
		int reversedN = reverse (n);
		
	}

	
	
	
	private int reverse(int n) {
		
		while(n != 0){
			int lastDigit = n % 10;
			n /= 10;
			print(lastDigit);
 		}
		
		return 0;
	}
	
}
