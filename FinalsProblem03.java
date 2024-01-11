import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class FinalsProblem03 extends ConsoleProgram {
	public void run() {

		String line = readLine("Enter string: ");
		String temp = "";

		// Use for loop to iterate over the whole String except the last one
		for (int i = 0; i < line.length() - 1; i++) {
			if (Character.isDigit(line.charAt(i))) {
				for (int j = 0; j < Integer.parseInt(Character.toString(line.charAt(i))); j++) {
					temp += Character.toString(line.charAt(i + 1));
				}
			}else{
				temp += Character.toString(line.charAt(i));
			}
		}
		
		// Add last character as a string to main string
		temp += Character.toString(line.charAt(line.length() - 1));

		println(temp);
	}
}
