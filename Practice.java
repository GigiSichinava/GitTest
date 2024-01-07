import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		
		int[][] myMatrix = new int[3][3];
		for(int i = 0; i < myMatrix.length; i++){
			for(int j = 0; j < myMatrix[i].length; j++){
				myMatrix[i][j] = 3;
			}
		}
		
		for(int i = 0; i < myMatrix.length; i++){
			for(int j = 0; j < myMatrix[i].length; j++){
				println(myMatrix[i][j] + "");
				println();
			}
		}
	}
}