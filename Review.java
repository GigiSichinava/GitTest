import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram{
	public void run(){
		
		String line = "50 + 11 - 43";
		println(line);
		
		int result = 0;
		char operation = '+';
		int currentNumber = 0;
		
		StringTokenizer tokenizer = new StringTokenizer(line, " ");
		while(tokenizer.hasMoreTokens()){
			String part = tokenizer.nextToken();
			if(part.equals("+") || part.equals("-")){
				operation = part.charAt(0);
			}else{
				currentNumber = Integer.parseInt(part);
				
				if(operation == '+'){
					result += currentNumber;
				}else if(operation == '-'){
					result -= currentNumber;
				}
			}
		}
		println(result);
	}
}