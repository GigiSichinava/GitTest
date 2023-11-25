import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		
		double a = readDouble();
		int result = 0;
		for(int i = 0; i < a; i++){
			int x = readInt();
			result += x;
		}
		println(result);
	}
}