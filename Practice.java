import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		
		int m = readInt();
		int n = readInt();
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		for(int i = 0; i < n; i++){
			int x = readInt();
			myList.add(x);
		}
		
		for(int i = 0; i < myList.size(); i++){
			for(int j = 0; j < myList.size(); j++){
				int a = myList.get(i);
				int b = myList.get(j);
				if(a + b == m){
					println("Right couple is : " + a + "and " + b);
				}
			}
		}
	}
}