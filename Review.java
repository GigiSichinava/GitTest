import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram {
    public void run() {
        String text = readLine("Text: ");

        for (int i = 0; i < text.length() / 2; i++) {
            char left = text.charAt(i);
            char right = text.charAt(text.length() - i - 1);

            if (left == right) {
                println(true);
            } else {
                println(false);
            }
        }
    }
}
