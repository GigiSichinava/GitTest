import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Problem50 extends ConsoleProgram {
	public void run() {
		String str = readLine();
		StringTokenizer tokenizer  = new StringTokenizer(str);
//		println(tokenizer.countTokens());
		
		while(tokenizer.hasMoreTokens()){
			String currToken = tokenizer.nextToken();
			println(currToken);
		}
	}

}