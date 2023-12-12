import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Problem60 extends ConsoleProgram{
	
	private static final int SENTINEL = -1;
	
	public void run(){
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		while(true){
			int n = readInt("Enter your number: ");
			if (n == SENTINEL){
				break;
			}
			myList.add(0);
		}
	}

}
