import acm.program.ConsoleProgram;

public class Problem56 extends ConsoleProgram{
	
	private int n;
	private int minNum;
	
	public void run(){
		int n = readInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++){
			array[i] = readInt("Enter your number: ");
		}
		min(array);
		println(minNum);
	}
	
	
	private void min(int[] array){
		minNum = array[0];
		for(int i = 1; i < n; i++){
			if(array[i] <= minNum){
				minNum = array[i];
			}
		}
	}
	
}