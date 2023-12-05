import java.util.Arrays;

import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram {
	public void run() {

		int n = readInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = readInt();
		}
		println(Arrays.toString(arr));
		println(isSorted(arr));
	}

	boolean isSorted(int[] arr) {
		for(int i = 1; i < arr.length; i++){
			if(arr[i] < arr[i - 1]){
				return false;
			}
		}
		return true;
	}
	
}