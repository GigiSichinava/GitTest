import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram {

	public void run() {
		
		String num = readLine("Text: ");
		int result = 0;
		
		for(int i = 0; i < num.length(); i++){
			int nextNum = result + num.charAt(i) - '0';
			result = nextNum * 10 + num.charAt(i);
		}
		println(result);
	}
	
}