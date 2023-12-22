

import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram{
	public void run(){
		
		String line = readLine();
		
		StringTokenizer tokenizer = new StringTokenizer(line, ", ");
		while(tokenizer.hasMoreTokens()){
			String token = tokenizer.nextToken();
			println(token);
		}
	}
}