import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram {

    private static final String SENTINEL = "";

    public void run() {

        ArrayList<String> myList = new ArrayList<String>();

        while (true) {
            String x = readLine("Enter a string (or press Enter to stop): ");
            if (x.equals(SENTINEL)) {
                break;
            }
            myList.add(x);
        }

        Map<String, Integer> occurrencesMap = new HashMap<>();

        for (String str : myList) {
            if (occurrencesMap.containsKey(str)) {
                occurrencesMap.put(str, occurrencesMap.get(str) + 1);
            } else {
                occurrencesMap.put(str, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : occurrencesMap.entrySet()) {
            String str = entry.getKey();
            int count = entry.getValue();
            println("Occurrence of " + str + " is : " + count);
        }
    }
}
