import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram {

	private static final int SENETINEL = -1;

	public void run() {
		ArrayList<Integer> myList = new ArrayList<Integer>();
		while (true) {
			int n = readInt();
			if (n == SENETINEL) {
				break;
			}
			myList.add(n);
		}
		printReversedOrder(myList);

	}

	private void printReversedOrder(ArrayList<Integer> myList) {
		for (int i = myList.size() - 1; i >= 0; i--) {
			println(myList.get(i));
		}
	}
}