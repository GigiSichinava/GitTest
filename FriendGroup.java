import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FriendGroup {
	
	private Map<String, ArrayList<String>> frinedMap;
	
	public FriendGroup(){
		frinedMap = new HashMap<>();
	}
	
	public void addFrined(String person, String friend){
		if(!frinedMap.containsKey(person)){
			frinedMap.put(person, new ArrayList<String>());
		}
		
		ArrayList<String> friends = frinedMap.get(person);
		friends.add(friend);
	}
}
