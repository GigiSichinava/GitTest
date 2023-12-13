import acm.program.ConsoleProgram;

public class Problem54 extends ConsoleProgram {
    public void run() {
        int n = readInt("Enter the number of integers: ");
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = readInt("Enter an integer: ");
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        println("The two maximum integers are: " + max1 + " and " + max2);
    }
}
