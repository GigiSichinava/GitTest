import acm.program.ConsoleProgram;

public class Problem51 extends ConsoleProgram {
	public void run(){
			String s = readLine();
			println(deleteCharacters(s));

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

}
