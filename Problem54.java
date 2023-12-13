import acm.program.ConsoleProgram;

public class Problem54 extends ConsoleProgram{
	public void run(){
		
		int n = readInt();
		int[] myArray = new int[n];
		for(int i = 0; i < n; i++){
			myArray[i] = readInt();
		}
		int maxNum1 = myArray[0];
		int maxNum2 = myArray[0];
		
		for(int j = 1; j < myArray.length; j++){
			if(myArray[j] > maxNum1){
				maxNum1 = myArray[j];
				maxNum2 = maxNum1;
			}
		}
		println(maxNum1);
		println(maxNum2);
	}
}