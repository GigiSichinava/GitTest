import acm.program.ConsoleProgram;

public class FinalsProblem07 extends ConsoleProgram {
    public void run() {
        int[][] myMatrix = {
            {0, 0, 0, 1, 0, 1, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0},
            {1, 0, 0, 1, 1, 1, 0, 0},
            {0, 1, 0, 1, 0, 0, 0, 0},
            {0, 0, 1, 0, 1, 0, 1, 0},
            {0, 1, 0, 1, 0, 1, 0, 0},
            {1, 0, 0, 0, 1, 0, 1, 0}
        };
        
        int rows = myMatrix.length;
        int cols = myMatrix[0].length;
        int maxXSize = 0;
        
        for(int i = 0; i < rows; i++){
        	for(int j = 0; j < cols; j++){
        		int size = 0;
        		if(myMatrix[i][j] == 1){
        			size = 1;
        			
        			while (size <= i && size <= j && size <= cols - 1 - j && size <= rows - 1 - i
							&& myMatrix[i - size][j - size] == 1 && myMatrix[i + size][j + size] == 1
							&& myMatrix[i - size][j + size] == 1 && myMatrix[i + size][j - size] == 1) {
        				size++;
					}
        		}
        			maxXSize = Math.max(maxXSize, size);
			}
		}
        println(maxXSize);
    }
}


