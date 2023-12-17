import java.util.Arrays;

import acm.program.ConsoleProgram;

public class Problem58 extends ConsoleProgram{
	public void run(){
		
		int x = readInt("Width: ");
		int y = readInt("Height: ");
		int[][] myMatrix = new int[x][y];
		for(int i = 0; i < x; i++){
			for(int j = 0; j < y; j++){
				myMatrix[i][j] = readInt();
			}
		}
		println(isMatrixMagic(myMatrix));
	}
	
	private boolean isMatrixMagic(int[][] myMatrix){
		int a = myMatrix.length;
		int b = myMatrix[0].length;
		if(a != b){
			return false;
		}
		
		int k = 0;
		int[] myArray = new int[a * a];
		for(int i = 0; i < myMatrix.length; i++){
			for(int j = 0; j < myMatrix[0].length; j++){
				myArray[k] = myMatrix[i][j];
				k++;
			}
		}
		
		Arrays.sort(myArray);
		
		for(int i = 0; i < myArray.length; i++){
			if(myArray[i] - i != 1){
				return false;
			}
		}
		
		return true;
	}
}