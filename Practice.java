import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		double a = readDouble();
		println(factorial(a));
	}
	private double factorial(double a){
		double result = 1;
		for(int i = 1; i <= a; i++){
			result *= i;
		}
		return result;
	}
}