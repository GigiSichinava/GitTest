import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram {
	public void run() {

		String str = readLine();
		String a = readLine();
		String b = readLine();
	}

	private void contains(String a, String b) {
		String result = " ";

		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);
			if(ch == b.charAt(0)){
				result = result + 1;
			}
		}
		
	}

}