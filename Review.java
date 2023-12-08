import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram{
	
	private int FirstNum;
	
	public void run(){
		 
		 int n = readInt("Enter your number: ");
		 int[] Array = new int[n];
		 
		 int FirstNum = Array[0];
		 for (int i = 1; i < Array.length; i++){
			 if(Array[i + 1] > FirstNum){
				 FirstNum = Array[i + 1];
			 }
		 }
		 println(FirstNum);
	}
}