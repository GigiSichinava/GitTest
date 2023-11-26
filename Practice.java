import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		
		int number = readInt("Ur number");
		boolean isPrime = true;
		
		for(int i = 1; i < Math.sqrt(number); i++){
			if(number % i == 0){
				isPrime = false;
			} else {
				isPrime = true;
			}
		}
		println(isPrime);
	}
}