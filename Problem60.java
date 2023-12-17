import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Problem60 extends ConsoleProgram{
	
	private static final int SENTINEL = -1;
	
	public void run(){
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		while(true){
			int Num = readInt();
			myList.add(Num);
			if(Num == SENTINEL)
				break;
			}
		println(reversedOrder(myList));
		}

	private String reversedOrder(ArrayList<Integer> myList) {
		String result = "";
		for(int i = myList.size() - 1; i >= 0; i--){
			result += myList.get(i);
		}
		
		
		return result;
	}
}
