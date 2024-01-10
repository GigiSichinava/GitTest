import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class FinalsProblem3 extends ConsoleProgram {
	public void run() {

		String line = readLine("Enter string: ");
		String temp = "";

		for (int i = 0; i < line.length() - 2; i++) {
			if (Character.isDigit(line.charAt(i))) {
				for (int j = 0; j < Integer.parseInt(Character.toString(line.charAt(i))); i++) {
					temp += Character.toString(line.charAt(i + 1));
				}
			}
		}
		temp += Character.toString(line.charAt(line.length() - 1));

		println(temp);
	}
}
