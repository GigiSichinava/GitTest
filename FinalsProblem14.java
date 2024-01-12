import acm.program.ConsoleProgram;
import java.util.StringTokenizer;

public class FinalsProblem14 extends ConsoleProgram {
    public void run() {
        String line = readLine();
        String longestUniqueWord = "";
        int maxLength = 0;

        StringTokenizer tokenizer = new StringTokenizer(line, " ");
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();

            if (isUnique(word) && word.length() > maxLength) {
                maxLength = word.length();
                longestUniqueWord = word;
            }
        }

        println("Longest unique word: " + longestUniqueWord);
    }

    private boolean isUnique(String word) {
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    return false; // Found a duplicate character, so word is not unique
                }
            }
        }
        return true; // No duplicate characters found
    }
}
