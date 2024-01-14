import acm.program.ConsoleProgram;

public class FinalsProblem05 extends ConsoleProgram{

    public  void run (){
        int[][] matrix = {
            {0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 1, 1, 1, 0},
            {0, 0, 1, 0, 0, 1, 0, 0},
            {0, 1, 1, 1, 1, 1, 1, 1},
            {0, 0, 1, 0, 0, 1, 1, 0},
            {0, 0, 1, 0, 0, 1, 0, 0}
        };

        System.out.println("Largest '+' size: " + findLargestPlus(matrix));
    }

    private static int findLargestPlus(int[][] matrix) {
        int maxPlusSize = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 1) {
                    int size = 1;
                    while (size <= i && size <= j && size <= rows - 1 - i && size <= cols - 1 - j
                           && matrix[i - size][j] == 1 && matrix[i + size][j] == 1
                           && matrix[i][j - size] == 1 && matrix[i][j + size] == 1) {
                        size++;
                    }
                    maxPlusSize = Math.max(maxPlusSize, size);
                }
            }
        }
		return maxPlusSize - 1;

    }
}
