import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram{
	public void run(){
		
		int n = readInt("Size of the Array: ");
		int[] Array = new int[n];
		
		for(int i = 0; i < Array.length - 1; i++){
			Array[i] = readInt();
			if(Array[i] > Array[i + 1]){
				println("Sorted");
			}else{
				println("Not Sorted");
			}
		}
	}
}