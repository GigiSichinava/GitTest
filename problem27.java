import acm.program.ConsoleProgram;

public class problem27 extends ConsoleProgram {
	public void run(){
		int n = readInt ("Enter n: ");
		int m = readInt ("Enter m: ");
		 	
		for(int i=0; i <= m; i++){
			n *=  n;
		}
		println(n);
		
	}
}
