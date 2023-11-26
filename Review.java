import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram {
    public void run() {
        int number = readInt("Enter a number: ");

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; // If there is a divisor, the number is not prime
                    break;
                }
            }
        }

        if (isPrime) {
            println(number + " is a prime number.");
        } else {
            println(number + " is not a prime number.");
        }
    }

    
}
