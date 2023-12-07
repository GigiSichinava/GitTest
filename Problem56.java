import acm.program.ConsoleProgram;

public class Problem56 extends ConsoleProgram{
	
	private int maxNum;
	
	public void run(){
		int n = readInt("Enter your number: ");
		int[] Array = new int[n];
		
		for( int i = 0; i < n; i++){
			maxNum = Array[0];
			Array[i] = readInt();
			if(Array[i] > maxNum){
				maxNum = Array[i];
			}
		}
		println(maxNum);
	}
}