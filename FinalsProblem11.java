import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class FinalsProblem11 extends ConsoleProgram {
	public void run() {

		String line = readLine();
		String finalResult = "";

		// Divide whole sentence with "spaces"
		StringTokenizer tokenizer = new StringTokenizer(line, " ");

		while (tokenizer.hasMoreTokens()) {
			String part = tokenizer.nextToken();

			String result = "";

			char firstChar = Character.toUpperCase(part.charAt(0));
			String lastChars = part.substring(1, part.length()).toLowerCase();

			// Add extra space at the end of each word
			result += Character.toString(firstChar) + lastChars + " ";

			finalResult += result;
		}

		println(finalResult);
	}
}
