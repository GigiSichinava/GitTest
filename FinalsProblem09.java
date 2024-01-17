import acm.program.ConsoleProgram;

public class FinalsProblem09 extends ConsoleProgram{
	public void run(){
		
		int[][] myMatrix = {
				{3, 5, 4, 0},
				{4, 6, 7, 0},
				{1, 3, 8, 0},
				{0, 0, 0, 0},
		};
		
		int cols = myMatrix[0].length;
		int rows = myMatrix.length;
		
		for(int i = 0; i < cols; i++){
			int maxInColumn = myMatrix[0][i];

			for(int j = 1; j < rows - 1; j++){

				if(myMatrix[j][i] >= maxInColumn){			
					maxInColumn = myMatrix[i][j];
				}
			}
			myMatrix[rows - 1][i] = maxInColumn;
			
		}
		
		 for (int[] row : myMatrix) {
	            for (int value : row) {
	                System.out.print(value + " ");
	            }
	            System.out.println();
	        }
	}
}
