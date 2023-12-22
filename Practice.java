import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram {
    public void run() {
        int n = readInt("Size of the Array: ");
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = readInt("Enter element " + (i + 1) + ": ");
        }
        println("Array is sorted: " + isSorted(array));
    }

    private boolean isSorted(int[] array) {
        // Check if the array has less than 2 elements
        if (array.length < 2) {
            return true;
        }

        for (int j = 0; j < array.length - 1; j++) {
            if (array[j] > array[j + 1]) {
                return false;
            }
        }
        return true;
    }
}
