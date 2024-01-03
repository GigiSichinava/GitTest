import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		
		int x = readInt("Check if number is prime: ");
		println(isPrime(x));
	}

	private boolean isPrime(int x) {
		int checkBefore = (int)Math.sqrt(x);
		for(int i = 2; i <= checkBefore; i++){
			if(x % i == 0){
				return false;
			}
		}
		
		return true;		
	}
}