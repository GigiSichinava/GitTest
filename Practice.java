import java.util.ArrayList;
import java.util.Arrays;

import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram {
	public void run() {

		int a = readInt();
		int b = readInt();
		int[][] myMatrix = new int[a][b];

		for (int i = 0; i < myMatrix.length; i++) {
			for (int j = 0; j < myMatrix[0].length; j++) {
				myMatrix[i][j] = readInt();
			}
		}
		printMatrix(myMatrix);
	}

	private void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			println(Arrays.toString(row));
		}
	}
	
	private boolean magicM(int[][] Matrix){
		
		int n = Matrix.length;
		int m = Matrix[0].length;
		if ( n != m){
			return false;
		
	}
		int result = 0;
		int[] myarray = new int[n*n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				int k = 0;
				while(k < n*n){
				myarray[k] = Matrix[i][j];
				k++;
				}
			}
		}
		Arrays.sort(myarray);
		for(int i = 0; i < myarray.length; i++){
			if(myarray[i] - i == 1){
				result++;
			}
		}
		return result == n * n;
	}
}
