import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram{
	public void run(){

		String line = "10 + 2 - 5";
		String[] myArray = new String[line.length()];
		println(line);
		
		int result = 0;
	 
		StringTokenizer tokenizer = new StringTokenizer(line, " ");
		while(tokenizer.hasMoreTokens()){
		String part = tokenizer.nextToken();
		for(int i = 0; i < line.length(); i++){
			myArray[i] = part;
			System.out.println(myArray.toString());
			}
		}
	}
}