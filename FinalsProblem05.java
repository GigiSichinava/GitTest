import acm.program.ConsoleProgram;

public class FinalsProblem05 extends ConsoleProgram {
	public void run(){
		int[][] myMatrix = {
			    {0b00000100},
			    {0b00001110},
			    {0b00100100},
			    {0b01111111},
			    {0b00100110},
			    {0b00100100}
		};

		int maxPluses = 0;
		
		int rows = myMatrix.length;
		int cols = myMatrix[0].length;
		
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j++){
				if(myMatrix[i][j] == 1){
					int size = 1;
					while(size <= i && size <= j && size <= rows - 1 - i && size <= cols - 1 - j && myMatrix[i - size][j] == 1 && myMatrix[i + size][j] == 1 && myMatrix[i][j - size] == 1 && myMatrix[i][j + size] == 1 ){
						size++;
					}
					maxPluses = Math.max(maxPluses, size);
				}
			}
		}
		println(maxPluses);
	}
}
