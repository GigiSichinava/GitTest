import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		
		double a = readDouble();
		int result = 0;
		for(int i = 1; i < a; i++){
			result += i;
			
		}
		println(result);
	}
}