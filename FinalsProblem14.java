import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class FinalsProblem14 extends ConsoleProgram {
	public void run() {

		String line = readLine();
		String result = "";
		int maxLength = 0;

		StringTokenizer tokenizer = new StringTokenizer(line, " ");

		while (tokenizer.hasMoreTokens()) {
			String part = tokenizer.nextToken();
			// Check if the word is unique and if its length is maximum
			if (isUnique(part) && part.length() > maxLength) {
				maxLength = part.length();
				result = part;
			}
		}
		println(result);
	}

	// Check if the word is made up with unique characters
	private boolean isUnique(String part) {
		for (int i = 0; i < part.length(); i++) {
			for (int j = i + 1; j < part.length(); j++) {
				char ch1 = part.charAt(i);
				char ch2 = part.charAt(j);
				if (ch1 == ch2) {
					return false;
				}
			}
		}
		return true;
	}
}