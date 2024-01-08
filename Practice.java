import java.util.Arrays;

import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		
		int n = readInt();
		int[] myArray = new int[n];
	
		for(int i = 0; i < myArray.length; i++){
			myArray[i] = readInt();
		}
		println(Arrays.toString(myArray));
		
		Arrays.sort(myArray);
		println(Arrays.toString(myArray));
	}
}