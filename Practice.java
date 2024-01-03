import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		
		int x = readInt("Check if number is prime: ");
		isPrime(x);
	}

	private boolean isPrime(int x) {
		double checkBefore = Math.sqrt(x);
		for(int i = 0; i <= checkBefore; i++){
			if(x % i == 0){
				return false;
			}
		}
		
		return true;		
	}
}