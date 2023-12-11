import java.util.Arrays;
import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram {
	public void run() {

		int[] Array1 = { 1, 3, 5, 7, 9 };
		int[] Array2 = { 2, 4, 6, 8 };

		int maxLength = Math.max(Array1.length, Array2.length);

		int[] result = new int[maxLength];
		int numOccurance = 0;

		for (int i = 0; i < maxLength; i++) {
			if (i < Array1.length) {
				result[numOccurance++] = Array1[i];
			}
			if (i < Array2.length) {
				result[numOccurance++] = Array2[i];
			}
		}

        result = Arrays.copyOf(result, numOccurance);

		println(Arrays.toString(result));

	}
}


