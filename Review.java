import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram {
	public void run() {

		String line = "10 + 2 - 5";
		println(line);
		ArrayList<String> myArray = new ArrayList<String>();

		
		StringTokenizer tokenizer = new StringTokenizer(line, " ");
		while (tokenizer.hasMoreTokens()) {
			String part = tokenizer.nextToken();
			myArray.add(part);
		}
		println(myArray);
	}
}