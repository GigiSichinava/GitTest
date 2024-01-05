import java.util.StringTokenizer;
import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram {
    public void run() {
        String line = "11 + 2 - 5";
        println("Expression: " + line);

        StringTokenizer tokenizer = new StringTokenizer(line, " ");
        int result = 0;
        int currentNumber = 0;
        char operation = '+';

        while (tokenizer.hasMoreTokens()) {
            String part = tokenizer.nextToken();

            if (part.equals("+") || part.equals("-")) {
                operation = part.charAt(0);
            } else {
                currentNumber = Integer.parseInt(part);

                if (operation == '+') {
                    result += currentNumber;
                } else if (operation == '-') {
                    result -= currentNumber;
                }
            }
        }

        println("Result: " + result);
    }
}
