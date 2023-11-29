import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram {
	public void run() {
		
		String text = readLine("text: ");
		StringTokenizer token = new StringTokenizer(text);
		println(token.countTokens());

	}

}