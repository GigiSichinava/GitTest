import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram {
    public void run() {
        String text = readLine("Enter your text here: ");
        int maxCount = 0;
        char maxCharacter = 0;

        for (char x = 'a'; x <= 'z'; x++) {
            int count = 0;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == x) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxCharacter = x;
            }
        }

        println(maxCharacter);
    }
}
