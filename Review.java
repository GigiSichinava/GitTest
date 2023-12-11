import java.util.Arrays;
import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram {
    public void run() {

        int[] Array1 = {1, 3, 5, 7, 9};
        int[] Array2 = {2, 4, 6, 8};

        int maxLength = Math.max(Array1.length, Array2.length);

        int[] result = new int[maxLength * 2]; // Double the length for safety

        int index = 0; // Index for the result array

        for (int i = 0; i < maxLength; i++) {
            if (i < Array1.length) {
                result[index++] = Array1[i];
            }
            if (i < Array2.length) {
                result[index++] = Array2[i];
            }
        }

//         // Trim the result array to the actual size
//       result = Arrays.copyOf(result, index);

        println(Arrays.toString(result));
    }
}
