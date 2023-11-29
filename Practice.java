import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram {
	public void run() {

		String text = readLine("Text: ");

		if (isPalidrom(text)) {
			println("true");
		} else {
			println("false");
		}
	}

	private boolean isPalidrom(String text) {
		for (int i = 0; i < text.length(); i++) {
			char left = text.charAt(i);
			char right = text.charAt(text.length() - i - 1);
			if (left != right) {
				return false;
			}
		}
		return true;
	}

}