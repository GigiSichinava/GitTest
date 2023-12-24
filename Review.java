import java.util.Arrays;

import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram{
	public void run(){
		
		int n = readInt();
		int[] Array = new int[n];
		
		for(int i = 0; i < n; i++){
			Array[i] = readInt();
		}
		
		println(Arrays.toString(Array));
		
	}
}