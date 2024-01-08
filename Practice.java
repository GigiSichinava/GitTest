import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
    public  void run(){
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        println("Original array: ");
        printArray(array);

        bubbleSort(array);

        println("\nSorted array: ");
        printArray(array);
    }

    // Bubble Sort implementation
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Utility method to print an array
    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
