import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram {
    public void run() {
        String text = readLine("Enter your text here: ");
        int maxCount = 0;
        char maxCharacter = 0;

        for (char c = 'a'; c <= 'z'; c++) {
            int count = 0;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == c) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxCharacter = c;
            }
        }

        println(maxCharacter);
    }
}
