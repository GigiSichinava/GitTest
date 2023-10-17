import acm.program.ConsoleProgram;

public class problem16 extends ConsoleProgram{
	public void run(){
		
		int a = readInt("Enter first number: ");
		int b = readInt ("Enter secont number: ");
		int c = readInt ("Enter third number: ");
		
		double d = (1/(double) a) + (1/(double) b) + (1/(double) c);
		
		print (1/d);
		print((a+b+c)/3.0);		
		
	}

}
