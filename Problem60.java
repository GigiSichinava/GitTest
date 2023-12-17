import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Problem60 extends ConsoleProgram {
	
	private static final int SENTINEL = -1;
	
	public void run() {
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		while (true) {
			int n = readInt("Enter your number: ");
			if (n == SENTINEL) {
				break;
			}
			myList.add(n);
		}
		
		printReversedOrder(myList);
	}

	private void printReversedOrder(ArrayList<Integer> list) {
		for (int i = list.size() - 1; i >= 0; i--) {
			println(list.get(i));
		}
	}
}
