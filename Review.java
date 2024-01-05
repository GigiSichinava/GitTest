import acm.program.ConsoleProgram;
import java.util.StringTokenizer;

public class Review extends ConsoleProgram {
    public void run() {
        String line = "10 + 2 - 5";
        println("Expression: " + line);

        int result = evaluateExpression(line);

        println("Result: " + result);
    }

    private int evaluateExpression(String expression) {
        StringTokenizer tokenizer = new StringTokenizer(expression, "+- ", true);

        int result = 0;
        int currentNumber = 0;
        char currentOp = '+';

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken().trim();

            if (token.isEmpty()) {
                continue;
            }

            if (token.equals("+") || token.equals("-")) {
                result = applyOperation(result, currentNumber, currentOp);
                currentOp = token.charAt(0);
                currentNumber = 0;
            } else {
                currentNumber = Integer.parseInt(token);
            }
        }
        result = applyOperation(result, currentNumber, currentOp);

        return result;
    }

    private int applyOperation(int accumulated, int currentNumber, char operation) {
        if (operation == '+') {
            return accumulated + currentNumber;
        } else {
            return accumulated - currentNumber;
        }
    }
}
