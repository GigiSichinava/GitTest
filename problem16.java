import acm.program.ConsoleProgram;

public class problem16 extends ConsoleProgram{
	public void run(){
		
		int a = readInt("Enter first number: ");
		int b = readInt ("Enter secont number: ");
		int c = readInt ("Enter third number: ");
		
		double d = (1/a) + (1/b) + (1/c);
		
		print (1/d);
		
		
	}

}
