import acm.program.ConsoleProgram;

public class FinalsProblem6 extends ConsoleProgram {
    public void run() {
        String line = readLine();
        int count = 0;

        for (int i = 0; i < line.length(); i++) {
            for (int j = i + 1; j <= line.length(); j++) {
                String substring = line.substring(i, j);
                if (hasEqualAandB(substring)) {
                    count++;
                }
            }
        }

        println(count);
    }

    private boolean hasEqualAandB(String substring) {
        int countA = 0;
        int countB = 0;

        for (int i = 0; i < substring.length(); i++) {
            if (substring.charAt(i) == 'a') {
                countA++;
            } else if (substring.charAt(i) == 'b') {
                countB++;
            }
        }

        // Returns true if the number of 'a's and 'b's are equal
        return countA == countB;
    }
}
