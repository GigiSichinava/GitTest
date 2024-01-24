import acm.program.ConsoleProgram;

public class FriendGroupConsole extends ConsoleProgram {
    
    private static final String SENTINEL = "";
    
    public void run() {
    
        FriendGroup myFriends = new FriendGroup();

        println("Enter a person and their friend. Enter an empty line to stop.");

        while (true) {
            String person = readLine("Enter person's name: ");
            if (person.equals(SENTINEL)) {
                break;
            }
            String friend = readLine("Enter friend's name for " + person + ": ");
            myFriends.addFriend(person, friend);
        }

        println("Person with most friends: " + myFriends.getPopularPerson());
        
        String popularPerson = myFriends.getPopularPerson();
        println("Friends of " + popularPerson + ": " + myFriends.getFrinedsAsString(popularPerson));
    }
}
