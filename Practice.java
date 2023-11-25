import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram {
    public void run() {
        int n = readInt("Enter n: ");
        int m = readInt("Enter m: ");

        int gcd = gcd(n, m);
        println("GCD is: " + gcd);
    }

    private int gcd(int n, int m) {
        while (m != 0) {
            int temp = m;
            m = n % m;
            n = temp;
        }
        return n;
    }
}
