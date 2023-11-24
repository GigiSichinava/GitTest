import acm.program.ConsoleProgram;

public class Problem51 extends ConsoleProgram {
	public void run() {
		String s = readLine();
		println(deleteCharacters(s));

		String a = readLine();
		String b = readLine();
	}

	private String deleteCharacters(String string) {
		String result = "";
		for (int i = 0; i < string.length(); i++) {
			if (i == 0 || string.charAt(i) != string.charAt(i - 1)) {
				result += string.charAt(i);
			}
		}
		return result;
	}

	private boolean contains(String a, String b) {
		for (int i = 0; i < a.length() - b.length(); i++) {
			if (b.equals(a.substring(i, i + b.length()))) {
				return true;
			}
		}
		return false;
	}

}
