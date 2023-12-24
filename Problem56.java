import java.util.Arrays;

import acm.program.ConsoleProgram;

public class Problem56 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter  n: ");
		int[] Array = new int[n];
		for (int i = 0; i < n; i++) {
			Array[i] = readInt("Enter  nums[" + i + "]: ");
		}

		println(Arrays.toString(Array));
		sort(Array);
		println(Arrays.toString(Array));
	}

	private void sort(int[] Array) {
		for (int i = 0; i < Array.length; i++) {
			int j = findMinIndex(Array, i);
			swap(Array, i, j);
		}
	}

	private void swap(int[] Array, int i, int j) {
		int tmp = Array[i];
		Array[i] = Array[j];
		Array[j] = tmp;
	}

	private int findMinIndex(int[] Array, int i) {
		int minIndexSoFar = i;
		for (int j = i; j < Array.length; j++) {
			if (Array[j] < Array[minIndexSoFar]) {
				minIndexSoFar = j;
			}
		}
		return minIndexSoFar;
	}
}