
//კონსოლიდან შეგყვავს n და შემდეგ n ცალი მთელი რიცხვი, იპოვეთ და დაბეჭდეთ ამ
//რიცხვებს შორის ორი მაქსიმალური რიცხვი.


import acm.program.ConsoleProgram;

public class Problem54 extends ConsoleProgram{
	public void run(){
		
		int n = readInt("Enter number: ");
		int[] myArray = new int[n];
		
		int maxNum = myArray[0];
		int maxNum2 = myArray[1];
		
		
		for(int i = 0; i < myArray.length; i++){
			myArray[i] = readInt();
			if(myArray[i] > maxNum){
				maxNum = myArray[i];
			}
			
			
		}
		println(maxNum);
		
	}
}