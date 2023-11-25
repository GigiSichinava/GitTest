import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram {
	public void run(){
		
		double n = readDouble();
		int result = 0;
		for(int i = 0; i <= n; i++){
			if(n % i == 0){
				result++;
			}
		}
	println(result);	
	}
}