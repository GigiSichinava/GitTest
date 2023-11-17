import acm.program.ConsoleProgram;

public class StingsPractice extends ConsoleProgram {
	public void run() {

		countSymbols();
	}

	private void countSymbols() {
		String text = readLine("Enter your text here: ");
		String symbolText = readLine("Enter symbol you are searching for: ");

		char symbol = symbolText.charAt(0);

		int numOccurances = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == symbol) {
				numOccurances++;

			}
		}

		println(numOccurances);

	}
}