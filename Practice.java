import java.util.HashMap;
import java.util.Map;

import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram {

    private static final String SENTINEL = "";

    public void run() {
        
//    	Map<String, Integer> myMap = new HashMap<>();
//
//        while (true) {
//            String name = readLine("Enter name (or press Enter to stop): ");
//            if (name.equals(SENTINEL)) {
//                break;
//            }
//            myMap.put(name, myMap.getOrDefault(name, 0) + 1);
//        }
//
//        println("Name Occurrences:");
//
//        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
//            String name = entry.getKey();
//            int occurrences = entry.getValue();
//            println("Occurrence of " + name + " is : " + occurrences);
//        }
    	
    	int a = readInt();
    	int b = readInt();
    	int c = readInt();
    	
    	if(a > b){
    		println(">");
    	}else{
    		println("<");
    	}
    	
//    	if(a > b){
//    		println(">");
//    	}else if(a > c){
//    		println("a beze meti araa mara c ze metia");
//    	}
    	
    	
    }
}
