import acm.program.ConsoleProgram;

public class FindMaxArray extends ConsoleProgram{
	
	private int maxNum;
	
	public void run(){
		int n = readInt("Enter your number: ");
		int[] Array = new int[n];
		
		maxNum = Array[0];
		for( int i = 0; i < Array.length; i++){
			Array[i] = readInt();
			if(Array[i] >= maxNum){
				maxNum = Array[i];
			}
		}
		println(maxNum);
	}
}