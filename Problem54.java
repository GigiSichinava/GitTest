
//კონსოლიდან შეგყვავს n და შემდეგ n ცალი მთელი რიცხვი, იპოვეთ და დაბეჭდეთ ამ
//რიცხვებს შორის ორი მაქსიმალური რიცხვი.


import java.lang.reflect.Array;

import acm.program.ConsoleProgram;

public class Problem54 extends ConsoleProgram{
	public void run(){
		
		int n = readInt("Enter number: ");
		int[] myArray = new int[n];
		for(int i = 0; i < myArray.length; i++){
			myArray[i] = readInt();
		}
		
		int maxNum = myArray[0];
		int maxNum2 = myArray[0];
		
		for(int i = 1; i < myArray.length; i++){
			if(myArray[i] > maxNum){
				maxNum2 = maxNum;
				maxNum = myArray[i];
				
			}
		}
		println(maxNum);
		println(maxNum2);
	}
}