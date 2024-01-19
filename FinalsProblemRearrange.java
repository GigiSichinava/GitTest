import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

import acm.program.ConsoleProgram;

public class FinalsProblemRearrange extends ConsoleProgram{
	public void run(){
		
		// Test code and its input-output
		String line = "keep calm and code on";
		println(line);
		String expected = "on and keep calm code" ;
		println(expected);
		String result = "";
		
		StringTokenizer tokenizer = new StringTokenizer(line, " ");
		// TreeMap automatically sorts its values according to key (integers) increasement
		Map<Integer, String> stringMap = new TreeMap<>();
		
		while(tokenizer.hasMoreTokens()){
			String part = tokenizer.nextToken();
			int length = part.length();
			
			if(!stringMap.containsKey(length)){
				stringMap.put(length, part);
			}else{
				// If current length (key) is occupied, change its current value with "part" added to it
				stringMap.put(length, stringMap.get(length) + " " + part);
			}
		}
		
		// Add values to result and print it
		for(String put : stringMap.values()){
			result += put + " ";
		}
		
		println(result);
	}
}