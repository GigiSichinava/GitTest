import java.util.Arrays;

import acm.program.ConsoleProgram;

public class FinalsProblem1 extends ConsoleProgram{
	public void run(){
	
		int a = readInt("");
		int[] firstNumber = new int[a];
		for(int i = 0; i < firstNumber.length; i++){
			firstNumber[i] = readInt();
		}
		
		int b = readInt();
		int[] secondNumber = new int[b];
		for(int i = 0; i < secondNumber.length; i++){
			secondNumber[i] = readInt();
		}
		
		String strA = transformToString(firstNumber);
		String strB = transformToString(secondNumber);
		
		int intA = Integer.parseInt(strA);
		int intB = Integer.parseInt(strB);
		
		int SUM = intA + intB;
	
		int length = 0;
		while(SUM > 0){
			length++;
			SUM /= 10;
		}
		int[] result = new int[length];
		for(int i = length - 1; i >= 0; i--){
			result[i] = SUM % 10;
			SUM /= 10;
		}
		
		println(Arrays.toString(result));
		
	}

	private String transformToString(int[] firstNumber) {
		int result = 0;
		for(int i = firstNumber.length - 1; i >= 0; i--){
			result += firstNumber[i] * Math.pow(10, firstNumber.length - 1 - i);
		}
		return Integer.toString(result);
	}
}
