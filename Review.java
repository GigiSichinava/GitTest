import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram {
	
	private String result = "";
	
	public void run() {
		String str1 = readLine("Enter first string here: ");
		String str2 = readLine("Enter second string here: ");

		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
//				if ((int) str1.charAt(i) % 2 == 0 && (int) str2.charAt(j) % 2 != 0) {
					result += str1.charAt(i) + "" + str2.charAt(j);
				}
			}
//		}
		println(result);
	}
}


  


