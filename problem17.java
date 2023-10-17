import acm.program.ConsoleProgram;

public class problem17 extends ConsoleProgram {
	public void run(){
			
		double a = readDouble ("Enter real number: ");
		int integerPart = (int)a;
		double fractionPart = a - integerPart;
		
		println("Integer part: " + integerPart);
		println("Fraction part: " + fractionPart);
		
	}

}
