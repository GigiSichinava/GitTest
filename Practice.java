import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	
	private static final int SENTINEL = -1;
	
	public void run(){
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		while(true){
			int x = readInt();
			if(x == SENTINEL){
				break;
			}
			myList.add(x);
		}
		
		for(int i = 0; i < myList.size(); i++){
			int result = 0;
			if(myList.get(i) == 0){
				result++;
			}
			println("Occurance of " + i + " is : " + result);
		}
		
	}
}