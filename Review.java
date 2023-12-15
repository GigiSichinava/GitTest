import java.util.Arrays;

import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram{
	public void run(){
		
		int x = readInt();
		int y = readInt();
		int[][] myMatrix = new int[x][y];
		for(int i = 0; i < x; i++){
			for(int j = 0; j < y; j++){
				myMatrix[i][j] = readInt();
			}
		}
		isMatrixMagic(myMatrix);
		
	}

	private boolean  isMatrixMagic(int myMatrix[][]){
		int a = myMatrix.length;
		int b = myMatrix[0].length;
		if(a != b){
			return false;
		}
		
		int k = 0;
		int[] Array = new int[a * a];
		for(int i = 0; i < myMatrix.length; i++){
			for(int j = 0; j < myMatrix[0].length; j++){
				Array[k] = myMatrix[i][j];
				k++;
			}
		}
		
		Arrays.sort(Array);
		
		for(int g = 0; g < Array.length; g++){
			if(Array[g] - g != 1){
				return false;
			}
		}
		
		
		return true;
		
	}
}