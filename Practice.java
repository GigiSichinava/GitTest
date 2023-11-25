import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram {
    public void run() {
        String s = readLine("Enter your text here: ");
        for (int i = 0; i < s.length(); i++) {
            char left = s.charAt(i);
            char right = s.charAt(s.length() - i - 1);
            if (left != right) {
                println("Negative");
                return;
            }
        }
        println("Positive");
    }
}
