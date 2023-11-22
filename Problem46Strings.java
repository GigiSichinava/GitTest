import acm.program.ConsoleProgram;

public class Problem46Strings extends ConsoleProgram {
	private int countCharacters(String string, char c) {
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}

	public void run() {
		String text = readLine("Enter your text here: ");
		int maxCount = 0;
		char maxCharcater = 0;
		for (char c = 'a'; c <= 'z'; c++) {
			int count = countCharacters(text, c);
			if (count > maxCount) {
				maxCount = count;
				maxCharcater = c;
			}
		}
		println(maxCharcater);
	}
}
