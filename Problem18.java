import acm.program.ConsoleProgram;

public class Problem18 extends ConsoleProgram {
	public void run(){
		
		int a = readInt("Enter first number: ");
		int b = readInt("Enter second number: ");
		
		if (a >= b){
			println(a);
		}else{
			println(b);		
		}
		
		
	}
}
