import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Finalsproblem14 extends ConsoleProgram{
	public void run(){
		
		String line = readLine();
		
		StringTokenizer tokenizer = new StringTokenizer(line, " ");
		while(tokenizer.hasMoreTokens()){
			String part = tokenizer.nextToken();
			
			int curLength = part.length();
			int maxLength = curLength;
			if(curLength >= maxLength){
				maxLength = curLength;
			}
			
			String result = "";
			for(int i = 0; i < part.length(); i++){
				char ch1 = part.charAt(i);
				for(int j = 1; j < part.length(); j++){
					char ch2 = part.charAt(j);
					if(ch1 != ch2){
						result += Character.toString(ch1);
					}
				}
			}
			
			println(result);
		}
		
	}
}
