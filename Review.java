import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram{
	public void run(){
		
		String line = "10 + 2 - 5";
		println(line);
		
		StringTokenizer tokenizer = new StringTokenizer(line, " ");
		while(tokenizer.hasMoreTokens()){
		String a = tokenizer.nextToken(line);
		println(a);
		}
	}
}