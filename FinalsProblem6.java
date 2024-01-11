import acm.program.ConsoleProgram;

public class FinalsProblem6 extends ConsoleProgram {
    public void run() {
        String line = readLine();
        int count = 0;

        // Iterating through all possible substrings
        for (int i = 0; i < line.length(); i++) {
            for (int j = i + 2; j <= line.length(); j += 2) { // Consider only even length substrings
                String substring = line.substring(i, j);
                if (hasEqualAandB(substring)) {
                    count++;
                }
            }
        }

        println(count);
    }

    private boolean hasEqualAandB(String substring) {
        int countA = 0, countB = 0;

        // Counting 'a's and 'b's in the substring
        for (int i = 0; i < substring.length(); i++) {
            if (substring.charAt(i) == 'a') {
                countA++;
            } else if (substring.charAt(i) == 'b') {
                countB++;
            }
        }

        // Only return true if the counts are exactly equal
        return countA == countB;
    }
}
