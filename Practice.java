import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		 
		double a = readDouble ("Enter your number: ");
		int integerPart = (int)a;
		double nonIntegerPart = a - integerPart;
		
		println("Integer part: " + integerPart);
		println("NonInteger part: " + nonIntegerPart);
					
	}
	
	
}
