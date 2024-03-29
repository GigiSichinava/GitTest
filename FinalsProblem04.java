import acm.program.ConsoleProgram;

public class FinalsProblem04 extends ConsoleProgram {
	public void run() {

		String line = readLine();

		// Transform string to array of characters
		char[] chars = line.toCharArray();

		int left = 0;
		int right = chars.length - 1;

		// Skin non-characters but swap characters
		while (left < right) {
			if (!Character.isAlphabetic(chars[left])) {
				left++;
			} else if (!Character.isAlphabetic(chars[right])) {
				right--;
			} else {
				char temp = chars[left];
				chars[left] = chars[right];
				chars[right] = temp;
				left++;
				right--;
			}
		}
		String result = new String(chars);
		println(result);

	}
}
