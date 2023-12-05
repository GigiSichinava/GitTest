import java.util.Arrays;

import acm.program.ConsoleProgram;

public class Problem54 extends ConsoleProgram{
	public void run(){
		
		
		int n = readInt();
		int[] array = new int[n];
		
		for(int i = 0 ; i < n; i++){
			array[i] = readInt();
		}
		
		Arrays.sort(array);
	
		println(Arrays.toString(array));
	}
}
