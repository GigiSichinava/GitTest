import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram {

    private static final int SENTINEL = -1;

    public void run() {

        ArrayList<Integer> myList = new ArrayList<Integer>();

        while (true) {
            int x = readInt("Enter an integer (or -1 to stop): ");
            if (x == SENTINEL) {
                break;
            }
            myList.add(x);
        }

        for (int i = 0; i < myList.size(); i++) {
            int a = myList.get(i);
            int result = 0;
            for (int j = 0; j < myList.size(); j++) {
                int b = myList.get(j);
                if (a == b) {
                    result++;
                }
            }
            println("Occurrence of " + a + " is : " + result);
        }
    }
}
