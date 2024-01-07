import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		
		int[][] myMatrix = new int[5][5];
		
		for(int i = 0; i < myMatrix[0].length; i++){
			for(int j = 0; j < myMatrix.length; j++){
				
				myMatrix[i][j] = 3;
			}
		}
		for (int i = 0; i < myMatrix.length; i++) {       // Iterate over rows
		    for (int j = 0; j < myMatrix[i].length; j++) { // Iterate over columns
		        println(myMatrix[i][j] + " ");    // Print each element followed by a space
		    }
		    println(myMatrix);                       // New line after each row
		}

	}
}