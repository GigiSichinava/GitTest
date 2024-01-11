import java.util.Arrays;

import acm.program.ConsoleProgram;

public class FinalsProblem1 extends ConsoleProgram {
	public void run() {

		// Create first Array
		int a = readInt("Size of the first number: ");
		int[] firstNum = new int[a];
		for (int i = 0; i < firstNum.length; i++) {
			firstNum[i] = readInt();
		}
		int firstInteger = transferToInteger(firstNum);

		// Create second Array
		int b = readInt("Size of the second number: ");
		int[] secondNum = new int[b];
		for (int j = 0; j < secondNum.length; j++) {
			secondNum[j] = readInt();
		}
		int secondInteger = transferToInteger(secondNum);

		// Get result as an integer and its size
		int SUM = firstInteger + secondInteger;
		int size = getIntegerSize(SUM);

		// Put integer into array
		int[] finalArray = new int[size];
		for (int i = finalArray.length ; i > 0; i--) {
			finalArray[i] = SUM % 10;
			SUM /= 10;
		}
		println(Arrays.toString(finalArray));
	}

	// Get size of the integer
	private int getIntegerSize(int sum) {
		int size = 0;
		if(sum == 0){
			return 1;
		}
		while (sum > 0) {
			size++;
			sum /= 10;
		}
		return size;
	}

	// Transfer array to integer
	private int transferToInteger(int[] number) {
		int result = 0;
		for (int i = number.length - 1; i >= 0; i--) {
			result += number[i] * Math.pow(10, number.length - 1 - i);
		}
		return result;
	}

}