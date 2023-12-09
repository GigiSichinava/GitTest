import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		double mid = average(5.0, 2.0);
		println(mid);
	}
	private double average(double a, double b){
		double sum = a + b;
		return sum / 2;
		
	}
}