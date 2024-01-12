import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Finalsproblem14 extends ConsoleProgram {
	public void run() {

		String line = readLine();
		String result = "";

		StringTokenizer tokenizer = new StringTokenizer(line, " ");
		while (tokenizer.hasMoreTokens()) {
			String part = tokenizer.nextToken();

			int curLength = part.length();
			int maxLength = 0;

			if (curLength >= maxLength) {
				maxLength = curLength;
				result = part;
			}

			for (int i = 0; i < part.length(); i++) {
				char ch1 = part.charAt(i);
				boolean isUnique = true;

				for (int j = i + 1; j < part.length(); j++) {
					char ch2 = part.charAt(j);
					isUnique = true;

					if (ch1 == ch2) {
						isUnique = false;
						break;
					}
				}
				if (isUnique) {
					result = part;
				}

			}

			println(result);
		}

	}
}
