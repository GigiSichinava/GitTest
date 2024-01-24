import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import acm.program.ConsoleProgram;

public class HashMaps extends ConsoleProgram{
	
	private static final String SENTINEL = "";
	
	public void run(){
		
		Map<String, ArrayList<String>> friendList = new HashMap<>();
		while(true){
			String friend = readLine();
			if(friend.equals(SENTINEL)){
				break;
			}
			String person = readLine();
			
			if(!friendList.containsKey(person)){
				friendList.put(person, new ArrayList<String>());
			}
			
			ArrayList<String> currFriends = friendList.get(person);
			currFriends.add(friend);
		}
			int maxFrineds = 0;
			String popularPerson = null;
			for(String Person : friendList.keySet()){
				int friendCount = friendList.get(Person).size();
				if(friendCount > maxFrineds){
					maxFrineds = friendCount;
					popularPerson = Person;
				}
			}
			println(popularPerson);

		
		println(friendList);
	}
}