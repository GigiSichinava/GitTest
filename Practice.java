import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	
	private static final int SENTINEL = -1;
	
	public void run(){
		
		ArrayList<Integer> myArrayList = new ArrayList<Integer>();
		
		while(true){
			int n = readInt();
			if(n == SENTINEL){
				break;
			}
			myArrayList.add(n);
		}
		printInReversedOrder(myArrayList);
	}

	private void printInReversedOrder(ArrayList<Integer> myArrayList) {
		for(int i = myArrayList.size() - 1; i >= 0; i-- ){
			println(myArrayList.get(i));
		}
	}
}