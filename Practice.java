import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		
		boolean isPrime = true;
		int number = readInt();
		
		for(int i = 1; i < Math.sqrt(number); i ++){
			if(number % i == 0){
				isPrime = true;
			} else {
				isPrime = false;
			}
		}
		
		if (isPrime){
			println("prime");
			} else {
				println("not prime");
		}
	}
}