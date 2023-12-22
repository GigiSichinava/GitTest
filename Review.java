import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram{
	public void run(){
		
		int n = readInt("Enter size of the Array: ");
		int[] Array = new int[n];
		
		for(int i = 0; i < Array.length; i++){
			Array[i] = readInt();
			println(Array);
		}
	}
}