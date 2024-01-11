import java.util.HashSet;
import java.util.Set;

import acm.program.ConsoleProgram;

public class FinalsProblem6 extends ConsoleProgram {
	public void run() {

		String line = readLine();
		Set<String> uniqueStrings = new HashSet<>();

		for (int i = 0; i < line.length(); i++) {
			for (int j = 1; j <= line.length(); j++) {
				String part = line.substring(i, j);
				if (countsAreSame(part)) {
					uniqueStrings.add(part);
				}
			}
		}
		
		println(uniqueStrings.size());
	}

	private boolean countsAreSame(String part) {

		int countA = 0;
		int countB = 0;
		
		for (int i = 0; i < part.length(); i++) {
			char ch = part.charAt(i);

			if (ch == 'a') {
				countA++;
			}
			if(ch == 'b'){
				countB++;
			}
		}
		return countA == countB;
	}
}