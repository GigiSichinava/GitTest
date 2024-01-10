import java.util.Arrays;

import acm.program.ConsoleProgram;

public class FinalsProblem1 extends ConsoleProgram {
	public void run() {

		// Create first Array
		int a = readInt("");
		int[] firstNum = new int[a];
		for (int i = 0; i < firstNum.length; i++) {
			firstNum[i] = readInt();
		}
		int firstInteger = transferToInteger(firstNum);

		// Create second Array
		int b = readInt();
		int[] secondNum = new int[b];
		for (int j = 0; j < secondNum.length; j++) {
			secondNum[j] = readInt();
		}
		int secondInteger = transferToInteger(secondNum);

		int SUM = firstInteger + secondInteger;

		int size = getIntegerSize(SUM);

		int[] finalArray = new int[size];
		for (int i = finalArray.length - 1; i >= 0; i--) {
			finalArray[i] = SUM % 10;
			SUM /= 10;
		}
		
		println(Arrays.toString(finalArray));
	}

	private int getIntegerSize(int sum) {
		int size = 0;
		while (sum >= 0) {
			size++;
			sum /= 10;
		}
		return size;
	}

	private int transferToInteger(int[] number) {
		int result = 0;
		for (int i = number.length - 1; i >= 0; i--) {
			result += number[i] * Math.pow(10, number.length - 1 - i);
		}
		return result;
	}

}