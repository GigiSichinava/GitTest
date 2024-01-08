import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(true){
			int x = readInt();
			if(x == -1){
				break;
			}
			list.add(x);
		}
		
		for(int i = list.size() - 1; i >= 0; i--){
			println(list.get(i));
		}
	}
}