import java.util.HashMap;
import java.util.Map;

import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	
	private static final String SENTINEL = "";
	
	public void run(){
		
		HashMap<String, Integer> myMap = new HashMap<>();
		
		while(true){
			String name = readLine("Enter name: ");
			if(name.equals(SENTINEL)){
				break;
			}
			myMap.put(name, myMap.getOrDefault(name, 0) + 1);
		}
		
		for(Map.Entry<String, Integer> entry : myMap.entrySet()){
			String name = entry.getKey();
			int occurance = entry.getValue();
            println("Occurrence of " + name + " is : " + occurance);
		}
	}
}