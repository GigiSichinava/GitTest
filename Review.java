import java.util.Arrays;

import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram {
	public void run(){
		
		int[] Array1 = {1, 3, 5, 7};
		int[] Array2 = {2, 4, 6, 8};
		
		int maxLength = Math.max(Array1.length, Array2.length);

		int[] result = new int[maxLength];
		
		for(int i = 0; i < maxLength; i++){
			if( i < maxLength){
				result[i] = Array1[i];
			}
			if( i < maxLength){
				result[i] = Array2[i];
			}
		}
		println(Arrays.toString(result));
		
	}
}