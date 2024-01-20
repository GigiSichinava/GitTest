import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Final2022Session1Matrix extends ConsoleProgram {
    
    private RandomGenerator rgen = RandomGenerator.getInstance();

    public void run() {
        int[][] matrix =  { {1, 0, 3, 4},
        					{5, 6, 7, 8},
        					{9, 0, 1, 2} };
			
        zero(matrix);

        // Print matrix after modification
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                print(matrix[i][j] + " ");
            }
            println();
        }
    }

    private void zero(int[][] matrix) {
        int temp = findTempNum(matrix);
        
        changeMatrixWithTemps(matrix, temp);
        changeTempsWithZero(matrix, temp);
    }

    private int findTempNum(int[][] matrix) {
        while (true) {
            int temp = rgen.nextInt(100, 999); // Use a range to avoid extremely large numbers
            if (!contains(matrix, temp)) {
                return temp;
            }
        }
    }

    private boolean contains(int[][] m, int num) {
        for (int[] row : m) {
            for (int element : row) {
                if (element == num) {
                    return true;
                }
            }
        }
        return false;
    }

    private void changeMatrixWithTemps(int[][] matrix, int temp) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    changeRowWithTemp(matrix, temp, i);
                    changeColWithTemp(matrix, temp, j);
                }
            }
        }
    }

    private void changeRowWithTemp(int[][] matrix, int temp, int row) {
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[row][j] != 0) { // Avoid overwriting already set temp values
                matrix[row][j] = temp;
            }
        }
    }

    private void changeColWithTemp(int[][] matrix, int temp, int col) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][col] != 0) { // Avoid overwriting already set temp values
                matrix[i][col] = temp;
            }
        }
    }

    private void changeTempsWithZero(int[][] matrix, int temp) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == temp) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
