import acm.program.ConsoleProgram;

public class FinalsProblem6 extends ConsoleProgram {
    public void run() {
        String line = readLine();
        int count = 0;

        // Iterate over all substrings, but only consider those of even length
        for (int i = 0; i < line.length(); i++) {
            for (int j = i + 2; j <= line.length(); j += 2) { // Increment by 2 to maintain even length
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

        // Count 'a's and 'b's in the substring
        for (int i = 0; i < substring.length(); i++) {
            if (substring.charAt(i) == 'a') {
                countA++;
            } else if (substring.charAt(i) == 'b') {
                countB++;
            }
        }

        // Return true if the number of 'a's and 'b's are equal
        return countA == countB;
    }
}
