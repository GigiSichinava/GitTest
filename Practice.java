import java.util.Arrays;

import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		
		int[] firstNum = {9, 9, 9, 5};
		int[] secondNum = {1, 2, 3};
		addBigInteger(firstNum, secondNum);
		
	}

	private void addBigInteger(int[] firstNum, int[] secondNum) {
		  
		String a = Arrays.toString(firstNum);
		String b = Arrays.toString(secondNum);
		
		int x = Integer.parseInt(a);
		int y = Integer.parseInt(b);
		
		int res = x + y;
		String res2 = Integer.toString(res);
		String result[] = res2.split("");
		println(result);
		
		
//		int resSize = 0;
//		while(res != 0){
//			
//			res /= 10;
//			resSize ++;
//		}
//		println(resSize);
		
	}
}