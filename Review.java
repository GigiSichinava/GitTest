import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram{
	
	private int FirstNum;
	
	public void run(){
		 
		 int n = readInt("Enter your number: ");
		 int[] Array = new int[n];
		 
		 for(int i = 0; i < n; i++){
			 Array[i] = readInt();
		 }
		 
		 int maxNum = Array[0];
		 
		 for (int i = 1; i < Array.length - 1; i++){
			 if(Array[i] > maxNum){
				 maxNum = Array[i];
			 }
		 }
		 println(maxNum);
	}
}