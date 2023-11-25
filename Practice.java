import acm.program.ConsoleProgram;

// strings 101

public class Practice extends ConsoleProgram {
	public void run() {
		String str = "beng biwo";
	}
		

	private String reveresdString(String str) {
		String result = " ";
		for (int i = 0; i < str.length(); i++) {
			result = str.charAt(i) + result;
		}
		return result;
	}
}
