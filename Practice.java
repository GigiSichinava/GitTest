import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		
		String text = readLine("text: ");
		int result = 0;
		
		for(int i = 0; i < text.length(); i++){
			int n = text.charAt(i) - '0';
			result = result * 10 + n;
		}
		println(result);
	}
}