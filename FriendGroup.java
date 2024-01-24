import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FriendGroup {
	
	private Map<String, ArrayList<String>> friendMap;
	
	public FriendGroup(){
		friendMap = new HashMap<>();
	}
	
	public void addFriend(String person, String friend){
		if(!friendMap.containsKey(person)){
			friendMap.put(person, new ArrayList<String>());
		}
		
		ArrayList<String> friends = friendMap.get(person);
		friends.add(friend);
	}
	
	public String getPopularPerson(){
		int maxCount = 0;
		String popularPerson = null;
		
		for(String person: friendMap.keySet()){
			int friendCount = friendMap.get(person).size();
			if(friendCount > maxCount){
				maxCount = friendCount;
				popularPerson = person;
			}
		}
		
		return popularPerson;
	}
	
	public String getFrinedsAsString(String person){
		if(!friendMap.containsKey(person)){
			return "No Frineds";
		}
		
		ArrayList<String> friends = friendMap.get(person);
		
		
		return friends.toString();
	}
}
