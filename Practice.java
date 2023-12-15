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
		println(magicM(myMatrix));
//		printMatrix(myMatrix);
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
		
		int k = 0;
		int[] myarray = new int[n*n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				while(k < n*n){
				myarray[k] = Matrix[i][j];
				k++;
				}
			}
		}
		Arrays.sort(myarray);
		for(int i = 0; i < myarray.length; i++){
			if (myarray[i + 1] - myarray[i] != 1) {
				return false;
			}
		}
		return true;
	}
	
//	
//	private boolean magicM(int[][] Matrix) {
//	    int n = Matrix.length;
//	    int m = Matrix[0].length;
//
//	    if (n != m) {
//	        return false;
//	    }
//
//	    int[] myarray = new int[n * n];
//	    int k = 0;
//
//	    for (int i = 0; i < n; i++) {
//	        for (int j = 0; j < m; j++) {
//	            myarray[k++] = Matrix[i][j];
//	        }
//	    }
//
//	    Arrays.sort(myarray);
//
//	    for (int i = 0; i < myarray.length - 1; i++) {
//	        if (myarray[i + 1] - myarray[i] != 1) {
//	            return false;
//	        }
//	    }
//
//	    return true;
//	}

}
