import java.util.Arrays;

import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram{
	public void run(){
		
		int rows = readInt("Enter number of rows");
		int collumns = readInt("Enter number of collumns");
		int[][] Matrix = new int[rows][collumns];
		if(rows != collumns){
			println("Matrix is not Magical");
		}
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < collumns; j++){
				Matrix[i][j] = readInt();
			}
		}
		println(isMagicMatrix(Matrix, rows, collumns));
	}

	private boolean isMagicMatrix(int[][] matrix, int rows, int collumns) {
		int[] Array = new int[rows * collumns];
		int k = 0;
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				Array[k] = matrix[i][j];
				k++;
			}
		}
		Arrays.sort(Array);
		
		for(int i = 0; i < Array.length; i++){
			if(Array[i] - i != 1);
			return false;
		}
		return true;
	}
}