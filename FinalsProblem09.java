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
			int currInt = myMatrix[0][i];
			for(int j = 0; j < rows; j++){
				if(myMatrix[j][i] >= currInt){
					currInt = myMatrix[i][j];
				}
			}
			myMatrix[cols -1 ][rows - 1] = currInt;
		}
		
		System.out.print(myMatrix);
	}
}
