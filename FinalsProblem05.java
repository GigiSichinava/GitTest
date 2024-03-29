import acm.program.ConsoleProgram;

public class FinalsProblem05 extends ConsoleProgram {
    public void run() {
        int[][] myMatrix = {
            {0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 1, 1, 1, 0},
            {0, 0, 1, 0, 0, 1, 0, 0},
            {0, 1, 1, 1, 1, 1, 1, 1},
            {0, 0, 1, 0, 0, 1, 1, 0},
            {0, 0, 1, 0, 0, 1, 0, 0}
        };

		int rows = myMatrix.length;
		int cols = myMatrix[0].length;
		int maxPlusSize = 0;
		
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j++){
				int size = 0;
				if(myMatrix[i][j] == 1){
					size = 1;
					
					// Break down while loop: size <= i && size <= j checks top and left sides of the matrix
					// size <= cols - j - 1 && size <= rows - i - 1 checks right and bottom sides of the matrix
					// rest of the loop checks 4 sides for expanding 1's
					while(size <= i && size <= j && size <= cols - 1 - j && size <= rows - 1 - i && myMatrix[i - size][j] == 1 && myMatrix[i + size][j] == 1 && myMatrix[i][j - size] == 1 && myMatrix[i][j + size] == 1){
						size++;
					}
					
					// We can also use: maxPlusSize = Math.max(size, maxPlusSize);
					if(size >= maxPlusSize){
						maxPlusSize = size;
						size = 0;
					}
				}
			}
		}
		println(maxPlusSize);
	}
}
