import acm.program.ConsoleProgram;

public class FinalsProblem4 extends ConsoleProgram {
    public void run() {
        String line = readLine("Enter string: ");
        char[] chars = line.toCharArray();

        int left = 0, right = chars.length - 1;
        while (left < right) {
            // Skip non-alphabetic characters from the left
            if (!Character.isAlphabetic(chars[left])) {
                left++;
            // Skip non-alphabetic characters from the right
            } else if (!Character.isAlphabetic(chars[right])) {
                right--;
            // Swap alphabetic characters
            } else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        String result = new String(chars);
        println("Result: " + result);
    }
}
