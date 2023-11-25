import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram {
	public void run() {

		String text = readLine("Enter your text here: ");
		String used = "";

		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);

			if (!used.contains("" + ch)) {
				int amount = 0;
}