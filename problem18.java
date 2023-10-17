import acm.program.ConsoleProgram;

public class problem18 extends ConsoleProgram {
	public void run(){
		
		int a = readInt("Enter first number: ");
		int b = readInt("Enter second number: ");
		
		if (a >= b) println(a);
		if (b >= a) println (b);
		
	}
}
