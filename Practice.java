import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		
		double a = readDouble();
		int result = 0;
		for(int i = 0; i < a; i++){
			result += i + 1;
			
		}
		println(result);
	}
}