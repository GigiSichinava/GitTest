import java.util.Arrays;

import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram{
	public void run(){
	
		int n = readInt("Size of the Array: ");
		int[] Array = new int[n];
	
		if(Array.length < 2){
			println("Array size must be greater than 1");
			
		}
		
		for(int i = 0; i < Array.length; i++){
			Array[i] = readInt("Enter number " + (i +1) + " : ");
		}
		
		Arrays.sort(Array);
		println(Arrays.toString(Array));
	}
}