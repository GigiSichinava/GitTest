import acm.program.ConsoleProgram;

public class FrinedGroupConsole extends ConsoleProgram{
	
	private static final String SENTINEL = "";
	
	public void run(){
	
		FriendGroup myFrineds = new FriendGroup();

		while(true){
			String friend = readLine();
			if(friend.equals(SENTINEL)){
				break;
			}
			String person = readLine();
			myFrineds.addFrined(person, friend);
		}
		System.out.println(myFrineds);
		
		println("Person with most frineds: " + myFrineds.getPopularPerson());
		
		
		String popularPerson = myFrineds.getPopularPerson();
		println(myFrineds.getFrinedsAsString(popularPerson));
	}
}
