import acm.program.ConsoleProgram;

public class Problem23version2 extends ConsoleProgram{
	public void run(){
		 
		int a = readInt ("Enter your number: ");
		int sum = 0;
		
		for (int i = 0; i < a; i++){
			int num = i + 1;
			sum += num;

		}
		
		println("Your result: " + sum);
	}
}
