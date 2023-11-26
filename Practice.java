import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		
		int a = readInt("enter your number: ");
		double sqrtA = Math.sqrt(a);
		int result = 0;
		for(int i = 1; i < sqrtA; i++){
			if( a % i == 0){
				result++;
			}
		}
		println(result);
	}
}