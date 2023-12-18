import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram {
    public void run() {
        String line = readLine();
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == line.charAt(line.length() - 1 - i)) {
                println("+");
            } else {
                println("-");
            }
        }
    }
}
