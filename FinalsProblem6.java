import acm.program.ConsoleProgram;

public class FinalsProblem6 extends ConsoleProgram{
	public void run(){
		 
		String line = "abab";
		String input = readLine();
		String result = "";
	
		int left = 0;
		int right = line.length() - 1;
		
		int countA = 0;
		int countB = 0;
		
		for(int i = 0 ; i < input.length(); i++){
			if(line.charAt(i) == 'a'){
				countA++;
			}
			if(line.charAt(i) == 'b'){
				countB++;
			}
		}
		println(countA);
		println(countB);
	}
}
