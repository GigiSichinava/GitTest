import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram {
	public void run() {

		String line = "55 + 0";
		println(line);

		int result = 0;
		int currentNumber = 0;
		char opperation = '+';

		StringTokenizer tokenizer = new StringTokenizer(line, " ");

		while (tokenizer.hasMoreTokens()) {
			String part = tokenizer.nextToken();
			if (part.equals("+") || part.equals("-")) {
				opperation = part.charAt(0);
			} else {
				currentNumber = Integer.parseInt(part);

				if (opperation == '+') {
					result += currentNumber;
				} else if (opperation == '-') {
					result -= currentNumber;
				}
			}
		}
		println(result);
	}
}