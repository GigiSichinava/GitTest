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
	}
	private void min(int[] array){
		int minNum = 0;
		for(int i = 0; i < n; i++){
			if(array[i] < array[i + 1]){
				minNum = array[i];
			}else{
				minNum = array[i + 1];
			}
		}
		int result = minNum;
		println(array[2]);
	}
	
}