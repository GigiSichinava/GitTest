import acm.program.ConsoleProgram;

public class Problem54 extends ConsoleProgram{
	
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
		for ( int j = 0; j < Array.length; j++){
			if(Array[j] )
		}
		println(maxNum);
	}
}