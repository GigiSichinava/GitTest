import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class FinalsProblem11 extends ConsoleProgram {
	public void run() {

		String line = "hElLo WORld";
		String finalResult = "";

		StringTokenizer tokenizer = new StringTokenizer(line, " ");
		while (tokenizer.hasMoreTokens()) {
			String part = tokenizer.nextToken();

			String result = "";
			for (int i = 0; i < part.length(); i++) {
				char firstChar = Character.toUpperCase(part.charAt(0));
				String lastChars = part.substring(1, part.length()).toLowerCase();

				result += Character.toString(firstChar) + lastChars + " ";
			}
			finalResult += result;
			println(finalResult);
		}
		
	}
}
