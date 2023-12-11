import acm.program.ConsoleProgram;

public class ArraysMax extends ConsoleProgram{
	public void run(){
		
		int lengthOfArray = readInt("Enter length: ");
		int[] Array = new int[lengthOfArray];
			for(int j = 0; j < lengthOfArray; j++){
				Array[j] = readInt();
			}
		int result = Array[0];
		for(int i = 0; i < Array.length; i++){
			if(result < Array[i]){
				result = Array[i];
			}
		}
		println(result);
	}
}