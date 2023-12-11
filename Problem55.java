import java.util.Arrays;
import acm.program.ConsoleProgram;

public class Problem55 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter n: ");
		int[] Array = new int[n];
		for (int i = 0; i < n; i++) {
			Array[i] = readInt("Enter number: ");
		}

		println(Arrays.toString(Array));
		println(isSorted2(Array));
		println(isSorted(Array));
	}

	boolean isSorted(int[] Array) {
		for (int i = 1; i < Array.length; i++) {
			if (Array[i] < Array[i - 1]) {
				return false;
			}
		}
		return true;
	}

	boolean isSorted2(int[] Array) {
		int[] ArrayCopy = Arrays.copyOf(Array, Array.length);

		Arrays.sort(ArrayCopy);
		return Arrays.equals(Array, ArrayCopy);
	}

}