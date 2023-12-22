import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram{
	public void run(){
		
		int n = readInt("Size of the Array: ");
		int[] Array = new int[n];
		
		for(int i = 0; i < Array.length; i++){
			Array[i] = readInt();
		}
		isSorted(Array);
	}
	
	private boolean isSorted (int[] Array){
		for(int j = 0; j < Array.length - 1; j++){
			if(Array[j] > Array[j + 1]){
				return true;
			}else{
				return false;
			}
		}
		return true;
	}
}
