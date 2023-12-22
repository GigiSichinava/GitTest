import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram {
	public void run() {

		int n = readInt("Enter size of the Array: ");
		int[] Array = new int[n];

		for (int i = 0; i < Array.length; i++) {
			Array[i] = readInt();
		}

		int maxNum1 = Array[0];
		int maNum2 = Array[0];

		for (int j = 1; j < Array.length; j++) {
			if (Array[j] > maxNum1) {
				maNum2 = maxNum1;
				maxNum1 = Array[j];
			}
		}
		println("First biggest number is: " + maxNum1);
		println("Second biggest number is: " + maNum2);
	}
}