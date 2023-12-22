import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram {
    public void run() {
        int n = readInt("Enter size of the Array: ");
        if (n < 2) {
            println("Array must contain at least two elements.");
            return;
        }

        int[] myArray = new int[n];
        for (int i = 0; i < n; i++) {
            myArray[i] = readInt("Enter number " + (i + 1) + ": ");
        }

        int maxNum1, maxNum2;

        // Initialize maxNum1 and maxNum2 to the first two elements
        if (myArray[0] > myArray[1]) {
            maxNum1 = myArray[0];
            maxNum2 = myArray[1];
        } else {
            maxNum1 = myArray[1];
            maxNum2 = myArray[0];
        }

        for (int j = 2; j < n; j++) {
            if (myArray[j] > maxNum1) {
                maxNum2 = maxNum1;
                maxNum1 = myArray[j];
            } else if (myArray[j] > maxNum2 && myArray[j] != maxNum1) {
                maxNum2 = myArray[j];
            }
        }

        println("First biggest number is: " + maxNum1);
        println("Second biggest number is: " + maxNum2);
    }
}
