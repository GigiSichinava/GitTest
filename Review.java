import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram{
	public void run(){
		
		String line = "10 + 2 - 5";
		println(line);
		
		int result = 0;
	
		StringTokenizer tokenizer = new StringTokenizer("+- ");
		String part = tokenizer.nextToken();
		println(part);
	}
}