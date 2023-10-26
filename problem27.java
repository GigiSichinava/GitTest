import acm.program.ConsoleProgram;

public class problem27 extends ConsoleProgram {
	public void run(){
		int n = readInt ("Enter n: ");
		int m = readInt ("Enter m: ");
		int a = n;	
		
		for(int i=1; i <= m; i++){
			n = n * a;
		}
		println(a);
		
	}
}
