import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram{
	public void run(){
		
		int n = readInt("Size of the Array: ");
		int[] Array = new int[n];
		
		for(int i = 0; i < Array.length; i++){
			Array[i] = readInt("Enter element " + (i + 1) + " : ");
		}
		println("Answer: " + isSorted(Array));
	}
	
	private boolean isSorted (int[] Array){
		if(Array.length < 2){
			return true;
		}
		
		for(int j = 0; j < Array.length - 1; j++){
			if(Array[j] > Array[j + 1]){
				return false;
			}
		}
		return true;
	}
}
