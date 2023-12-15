import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		
		int a = readInt();
		int b = readInt();
		int[][] myMatrix = new int[a][b];
		
		for(int i = 0; i < myMatrix.length; i++){
			for(int j = 0; j < myMatrix[0].length; j++){
				myMatrix[i][j] = readInt();
			}
		}
		println(myMatrix.toString());
	}
}