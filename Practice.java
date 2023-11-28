import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");
		printNewString(text);

	}

	private void printNewString(String text) {
		String result = "";
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if (!result.contains("" + ch)) {
				result += ch;
			}
		}
		println(result);
	}
}