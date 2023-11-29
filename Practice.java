import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		
		String text = readLine("Text: ");
		StringTokenizer tokenizer = new StringTokenizer ("");
		int count = 0;
		
		while(tokenizer.hasMoreTokens()){
			count++;
		}
		println(count);
	}
}