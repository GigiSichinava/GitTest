import acm.program.ConsoleProgram;

public class problem18 extends ConsoleProgram {
	public void run(){
		
		double a = readDouble("Enter first number: ");
		double b = readDouble("Enter second number: ");
		
		if (a>b) println(a);
		if (b>a) println (b);
		
	}
}
