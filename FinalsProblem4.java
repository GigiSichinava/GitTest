import java.util.Arrays;

import acm.program.ConsoleProgram;

public class FinalsProblem4 extends ConsoleProgram {
	public void run() {

		String line = readLine();
		String result = "";

		char[] chars = line.toCharArray();

		int left = 0;
		int right = line.length() - 1;

		for (int i = 0; i < line.length(); i++) {
			if (!Character.isAlphabetic(chars[i])) {
				left++;
			} else {
				if (!Character.isAlphabetic(chars[right])) {
					right--;
				} else {
					char temp = chars[left];
					chars[left] = chars[right];
					chars[right] = temp;
					left++;
					right++;
				}

			}
		}
		println(Arrays.toString(chars));
	}
}