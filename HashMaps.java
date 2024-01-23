import java.util.HashMap;

import acm.program.ConsoleProgram;

public class HashMaps extends ConsoleProgram{
	
	private static final String SENTINEL = "";
	
	public void run(){
		HashMap<String, Integer> nameMap = new HashMap<>();
		while(true){
			String name = readLine();
			if(name.equals(SENTINEL)){
				break;
			}
			
			if(!nameMap.containsKey(name)){
				nameMap.put(name, 0);
			}
			
			int newCount = nameMap.get(name) + 1;
			nameMap.put(name, newCount);
		}
		
		println(nameMap);
	}
}