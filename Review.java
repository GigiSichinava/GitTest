import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram {
	public void run() {
		String str = readLine();
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i))) {

				result += Character.toUpperCase(str.charAt(i));
			} else if (Character.isUpperCase(str.charAt(i))) {

				result += Character.toLowerCase(str.charAt(i));
			}
		}
		println(result);
	}
}
