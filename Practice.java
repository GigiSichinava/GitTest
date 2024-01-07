import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram {
    public void run() {
        int[][] myMatrix = new int[5][5];

        // Fill the matrix
        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix[i].length; j++) {
                myMatrix[i][j] = 3;
            }
        }

        // Print the matrix
        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix[i].length; j++) {
                print(myMatrix[i][j] + " ");
            }
            println(); // New line after each row
        }
    }
}
