import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		
		String text = readLine("Text: ");
		StringTokenizer tokenizer = new StringTokenizer(text);
		println(tokenizer.countTokens());
		
	}
}