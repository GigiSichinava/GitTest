import acm.program.ConsoleProgram;

public class FinalsProblem09 extends ConsoleProgram {
	public void run() {

		// Initialize matrix
		int[][] myMatrix = {
				{3, 5, 9, 0},
				{4, 6, 7, 0},
				{1, 3, 8, 0},
				{0, 0, 0, 0},
		};
		
		int cols = myMatrix[0].length;
		int rows = myMatrix.length;

		// Outer loop gets over the columns
		for (int i = 0; i < cols; i++) {
			int maxInColumn = myMatrix[0][i];
			// Inner loop gets over the rows
			for (int j = 0; j < rows; j++) {
				// Get max number in the column
				if (myMatrix[j][i] >= maxInColumn) {
					maxInColumn = myMatrix[j][i];
				}
			}
			// Put max number at the end of the column
			myMatrix[rows - 1][i] = maxInColumn;

		}

		int lastRow = myMatrix.length - 1;
		// Iterate over the last row to find max number
		for (int col = 0; col < cols; col++) {
			int curMaxInt = myMatrix[lastRow][col];
			if (myMatrix[lastRow][col] >= curMaxInt) {
				curMaxInt = myMatrix[lastRow][col];
			}
			myMatrix[lastRow][myMatrix[0].length - 1] = curMaxInt;
		}

		// Just print to check the code
		for (int[] row : myMatrix) {
			for (int value : row) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
	}
}
