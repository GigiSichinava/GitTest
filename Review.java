import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram {
    public void run() {
        String text = readLine("Text: ");

        for (char x = 'a'; x <= 'z'; x++) {
            int count = 0;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == x) {
                    count++;
                }
            }
            if (count > 0) {
                println(x + ": " + count);  // Concatenate the character and count as strings
            }
        }
    }
}
