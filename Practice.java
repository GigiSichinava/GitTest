
import java.util.HashMap;
import java.util.Map;

import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	private static final String SENTINEL = "";
	public void run() {
		Map<String, Integer> myMap = 
				new HashMap<String, Integer>();
		
		while(true) {
			String name = readLine("Enter name: ");
			if(name.equals(SENTINEL)) {
				break;
			}
			
			if(!myMap.containsKey(name)) {
				myMap.put(name, 0);
			}
			
			int newCount = myMap.get(name) + 1;
			myMap.put(name, newCount);
		}
		
		println(myMap);
		
	}

}