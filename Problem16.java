import acm.program.ConsoleProgram;

public class Problem16 extends ConsoleProgram{
	public void run(){
		
		double a = readInt("Enter first number: ");
		double b = readInt ("Enter secont number: ");
		double c = readInt ("Enter third number: ");
		
		double d = (1/a) + (1/b) + (1/c);
		
		println (1/d);
		
	}

}
