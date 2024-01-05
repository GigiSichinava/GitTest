import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class evalMidterm extends ConsoleProgram{
	public void run(){
		
		String line = "55 + 14 - 67";
		println(line);
		
		int result = 0;
		int currentNum = 0;
		char symbol = '+';
		
		
		StringTokenizer tokenizer = new StringTokenizer(line, " ");
		while(tokenizer.hasMoreTokens()){
			String part = tokenizer.nextToken();
			if(part.equals("+") || part.equals("-")){
				symbol = part.charAt(0);
			}else{
				currentNum = Integer.parseInt(part);
				
				if(symbol == '+'){
					result += currentNum;
				}else if(symbol == '-'){
					result -= currentNum;
				}
			}
		}
		println(result);
	}
}
