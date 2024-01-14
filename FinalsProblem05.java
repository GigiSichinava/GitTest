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

		int rows = myMatrix.length;
		int cols = myMatrix[0].length;
		int size = 0;
		
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j++){
				if(myMatrix[i][j] == 1){
					size = 1;
					while(size <= i && size <= j && size <= cols - 1 - j && size <= rows - 1 - i && myMatrix[i - size][j] == 1 && myMatrix[i + size][j] == 1 && myMatrix[i][j - size] == 1 && myMatrix[i][j + size] == 1){
						size++;
					}
				}
			}
		}
		
		println(size);
	}
}
