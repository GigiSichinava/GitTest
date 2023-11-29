import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Problem50 extends ConsoleProgram{
	public void run(){
	
		String text = readLine("Enter your text here: ");
		StringTokenizer tokenizer = new StringTokenizer(",.?!");
		int count = 0;
		
		while(tokenizer.hasMoreTokens()){
			String currToken = tokenizer.nextToken();
			count++;
		}
		println("Count:" + count);
		
	}

}

