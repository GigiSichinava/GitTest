import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram{
	public void run(){

		String line = "10 + 2 - 5";
		ArrayList<String> myArray = new ArrayList<String>();
		println(line);
		
		int result = 0;
	 
		StringTokenizer tokenizer = new StringTokenizer(line, " ");
		while(tokenizer.hasMoreTokens()){
		String part = tokenizer.nextToken();
			myArray.add(part);
			
		}
		println(myArray);
	}
}