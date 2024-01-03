import java.util.*;
import acm.program.ConsoleProgram;

public class Problem63 extends ConsoleProgram {
    
    public void run() {
        Map<String, Collection<String>> map = new HashMap<>();

        while (true) {
            String line = readLine("Enter key and value separated by space (or just press Enter to finish): ");
            if (line.isEmpty()) {
                break;
            }

            StringTokenizer tokenizer = new StringTokenizer(line);
            if (tokenizer.countTokens() < 2) {
                println("Invalid input. Please enter a key and a value separated by space.");
                continue;
            }

            String key = tokenizer.nextToken();
            String value = tokenizer.nextToken();

            map.putIfAbsent(key, new HashSet<>());
            map.get(key).add(value);
        }

        for (Map.Entry<String, Collection<String>> entry : map.entrySet()) {
            println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
