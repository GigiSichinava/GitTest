import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		
		String text = readLine();
		
		StringTokenizer tokenizer = new StringTokenizer(text);
		println(tokenizer.countTokens());
		
	
	}
}