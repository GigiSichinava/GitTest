import java.util.Arrays;

import acm.program.ConsoleProgram;

public class FinalsProblem6 extends ConsoleProgram{
	public void run(){
		 
		String line = readLine();
		int count = 0;
		
		for(int i = 0; i < line.length(); i++){
			for(int j = i + 1; j <= line.length(); j++){
				String substring = line.substring(i, j);
				if(hasEquallAandB(substring)){
					count++;
				}
			}
		}
		
		println(count);
		
	}

	private boolean hasEquallAandB(String substring) {
		int countA = 0;
		int countB = 0;
		
		for(int i = 0; i < substring.length(); i++){
			if(substring.charAt(i) == 'a'){
				countA++;
			}
			if(substring.charAt(i) == 'b'){
				countB++;
			}
			
			if(countA == countB){
				return true;
			}
			
		}
		return false;
	}
	

}

