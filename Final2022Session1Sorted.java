import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import acm.program.ConsoleProgram;

public class Final2022Session1Sorted extends ConsoleProgram {
    public void run() {
        println("sorted({2,3,4,5}) -> true: " + sorted(new ArrayList<>(Arrays.asList(2, 3, 4, 5))));
        println("sorted({4,1,3,2}) -> true: " + sorted(new ArrayList<>(Arrays.asList(4, 1, 3, 2))));
        println("sorted({3,1,5,2,4}) -> false: " + sorted(new ArrayList<>(Arrays.asList(3, 1, 5, 2, 4))));
    }

    private boolean sorted(ArrayList<Integer> a) {
        // Check if the list can be sorted by a single swap
        for (int i = 0; i < a.size(); i++) {
            for (int j = i + 1; j < a.size(); j++) {
                if (isSorted(listWithSwapped(a, i, j))) {
                    return true;
                }
            }
        }

        // Check if the list can be sorted by rotating a single sublist
        for (int i = 0; i < a.size(); i++) {
            for (int j = i + 1; j < a.size(); j++) {
                if (isSorted(listWithRotatedSublist(a, i, j))) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean isSorted(ArrayList<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    private ArrayList<Integer> listWithSwapped(ArrayList<Integer> list, int i, int j) {
        ArrayList<Integer> newList = new ArrayList<>(list);
        Collections.swap(newList, i, j);
        return newList;
    }

    private ArrayList<Integer> listWithRotatedSublist(ArrayList<Integer> list, int i, int j) {
        ArrayList<Integer> newList = new ArrayList<>(list);
        Collections.rotate(newList.subList(i, j + 1), -1);
        return newList;
    }
}
