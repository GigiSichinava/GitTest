import java.util.HashMap;

import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram{
	
	private String SENTINEL = "";
	
	public void run(){
		
		HashMap<String, Integer> myMap = new HashMap<String, Integer>();
		
		while(true){
			String name = readLine();
			if(name.equals(SENTINEL)){
				break;
			}
			if(!myMap.containsKey(name)){
				myMap.put(name, 0);
			}
			int newCount = myMap.get(name) + 1;
			myMap.put(name, newCount);
		}
		println(myMap);
	}
}