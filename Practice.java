import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		
		boolean isPrime = true;
		
		for(int i = 1; i < Math.sqrt(number); i++){
			int number = readInt("Ur number");
			if(number % i == 0){
				isPrime = false;
			} else {
				isPrime = true;
			}
		}
		println(isPrime);
	}
}