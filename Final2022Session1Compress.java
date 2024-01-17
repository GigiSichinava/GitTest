import acm.program.ConsoleProgram;

public class Final2022Session1Compress extends ConsoleProgram {
	public void run() {

		// See what code we have to write
		String line = "aabcccccaa";
		String expected = "a2b1c5a2";
		println(line);
		println(expected);

		String result = "";
		// First character's occurrence is already 1
		int count = 1;

		for (int i = 1; i < line.length(); i++) {
			// If character changes, add last character and its count to result
			if (line.charAt(i - 1) != line.charAt(i)) {
				result += line.charAt(i - 1);
				result += count;
				// Start count from 1 again
				count = 1;

			} else {
				// If characters repeat, just increase count
				count++;
			}

		}

		// We missed last character, so add it and its count to result
		result += line.charAt(line.length() - 1);
		result += count;

		println(result);
	}

}