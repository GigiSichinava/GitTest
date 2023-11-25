import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram {
	public void run() {

		String text = readLine();
		String symbolintext = readLine();

		char ch = symbolintext.charAt(0);
		int result = 0;

		
		
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ch) {
				result++;
			}
		}
		println(result);
	}
}