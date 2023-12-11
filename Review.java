import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram{
	public void run(){
		int[] Array = {2, 6, 3, 10, -2, 7};
		int result = Array[0];
		for(int i = 0; i < Array.length; i++){
			if(result < Array[i]){
				result = Array[i];
			}
		}
		println(result);
	}
}