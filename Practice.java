import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram {
	public void run() {
	
	String text = readLine("Text :");
	int result = 0;
	
	for(int i = 0 ; i < text.length(); i++){
		int n = text.charAt(i);
		result = result * 10 + n;
	}
	println(result);
	
	}
}