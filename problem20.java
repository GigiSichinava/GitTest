import acm.program.ConsoleProgram;

public class problem20 extends ConsoleProgram{
	public void run(){
		
		int n = readInt("Enter your number: ");		
		int c = 0;
		
		for(int i = 1; i <= n; i++){
			int m = readInt("Add your number: ");
			c += m;						
		}
		println(c);
	}
}
