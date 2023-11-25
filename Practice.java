import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram {
	public void run() {

		String text = readLine("Enter your text here: ");
		String symbolInText = readLine("Enter your symbol here: ");

		char symbol = symbolInText.charAt(0);

		int numOfOccurances = 0;

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == symbol) {
				numOfOccurances++;
			}
		}
		println(numOfOccurances);
	}
}