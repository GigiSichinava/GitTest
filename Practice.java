import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
	
		double a = readDouble("Enter your first number here: ");
		double b = readDouble("Second number");
		
		if (a > b){
			println(a);
		} else {
			println(b);
		}
		
	}
}