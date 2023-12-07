import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram{
	
	private int minNum;
	
	public void run(){
		
		int n = readInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++){
			array[i] = readInt("Enter your number: ");
		}
		min(array);
	}
	private void min(int[] array){
		minNum = array[0];
		for(int i = 1; i < array.length; i++){
			if(array[i] <= minNum){
				minNum = array[i];
			}
		}
		println(minNum);
	}
	
}