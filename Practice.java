import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram {
	public void run() {
		
		String num = readLine("Enter number: ");
		int result = 0;
		
		for(int i = 0; i < num.length(); i++){
			int n = num.charAt(i) - '0';
			println(n);
		}
		
		
	}
}