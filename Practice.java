import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	
	private static final int SENTINEL = -1;
	
	public void run(){
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		int Num = readInt();
		while(true){
			if(Num == SENTINEL)
				break;
			}
		myList.add(Num);
		println(reversedOrder(myList));
		}

	private String reversedOrder(ArrayList<Integer> myList) {
		String result = "";
		for(int i = myList.size() - 1; i > 0; i--){
			result += myList.get(i);
		}
		
		
		return result;
	}
}
