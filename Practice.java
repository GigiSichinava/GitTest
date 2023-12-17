import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram {

    private static final String SENTINEL = null;

    public void run() {

        ArrayList<String> myList = new ArrayList<String>();

        while (true) {
            String x = readLine();
            if (x.equals(SENTINEL)) {
                break;
            }
            myList.add(x);
        }

        for (int i = 0; i < myList.size(); i++) {
            String a = myList.get(i);
            int result = 0;
            for (int j = 0; j < myList.size(); j++) {
                String b = myList.get(j);
                if (a == b) {
                    result++;
                }
            }
            println("Occurrence of " + a + " is : " + result);
        }
    }
}
