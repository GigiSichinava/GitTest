import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		 
		int a = readInt ("Enter your number: ");
		int sum = 0;
		
		for (int i = 0; i < a; i++){
			int k = i + 1;
			int num = readInt ("Enter number " + k + ":");
			sum += num;
		}
		
		println(sum);			
		
	}
}
