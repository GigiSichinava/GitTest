import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		double a = readDouble();
		double b = readDouble();
		double mid = average(a, b);
		println(mid);
	}
	private double average(double a, double b){
		double sum = a + b;
		return sum / 2;
		
	}
}