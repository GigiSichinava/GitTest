import acm.program.ConsoleProgram;

public class problem28 extends ConsoleProgram{
	
	private static final int SENTINEL = -1;
	
	
	public void run(){
		int n = readInt ("Enter positive number: ");
		int numberOfOdds = 0;
		
		while(true){
			
			int odd = readInt ("Enter your number: ");
			if(odd == SENTINEL);
			break;
		}
		
		while (n % 2 == 0){
			numberOfOdds++;
			
		}
		
		print(numberOfOdds);
	}
}
