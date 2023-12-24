import java.util.Arrays;

import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram{
	public void run(){
		
		int n = readInt();
		int[] Array = new int[n];
		
		for(int i = 0; i < n; i++){
			Array[i] = readInt();
		}
		
		sort(Array);
		println(Arrays.toString(Array));

	}

	private void sort(int[] array) {
		for(int i = 0; i < array.length; i++){
			int j = findMinIndex(array , i);
			swap(array, i, j);
		}
		
	}

	private void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	private int findMinIndex(int[] array, int i) {
		int minIndexSofar = i;
		for(int a = i; a < array.length; a++){
			if(array[a] < array[minIndexSofar]){
				minIndexSofar = a;
			}
		}
		return minIndexSofar;
	}
}