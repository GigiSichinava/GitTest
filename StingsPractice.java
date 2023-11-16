import acm.program.ConsoleProgram;

public class StingsPractice extends ConsoleProgram {
	public void run() {

		String text = readLine("txt");
		String symbolText = readLine("Enter symbol");

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
