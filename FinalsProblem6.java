import acm.program.ConsoleProgram;
import java.util.HashSet;
import java.util.Set;

public class FinalsProblem6 extends ConsoleProgram{
    public void run(){
        
        String line = readLine();
        Set<String> uniqueSubstrings = new HashSet<>();

        for(int i = 0; i < line.length(); i++){
            for(int j = i + 1; j <= line.length(); j++){
                String part = line.substring(i, j);
                if(hasSameAmount(part)){
                    uniqueSubstrings.add(part); // Adds to set if condition is met
                }
            }
        }

        println(uniqueSubstrings.size()); // Prints the count of unique substrings
    }

    private boolean hasSameAmount(String part) {
        int countA = 0;
        int countB = 0;

        for(int i = 0; i < part.length(); i++){
            char ch = part.charAt(i);
            if(ch == 'a'){
                countA++;
            }
            if(ch == 'b'){
                countB++;
            }
        }
        return countA == countB;
    }
}
