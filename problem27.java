import acm.program.ConsoleProgram;

public class problem27 extends ConsoleProgram {
	public void run(){
		int n = readInt ("Enter n: ");
		int m = readInt ("Enter m: ");
		 	
		for(int i=1; i <= m; i++){
			n = n * n;
		}
		println(n);
		
	}
}
