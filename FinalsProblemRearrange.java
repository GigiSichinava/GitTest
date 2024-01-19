import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

import acm.program.ConsoleProgram;

public class FinalsProblemRearrange extends ConsoleProgram{
	public void run(){
		
		String line = "keep calm and code on";
		println(line);
		String expected = "on and keep calm code" ;
		println(expected);
		String result = "";
		
		StringTokenizer tokenizer = new StringTokenizer(line, " ");
		Map<Integer, String> stringMap = new TreeMap<>();
		
		while(tokenizer.hasMoreTokens()){
			String part = tokenizer.nextToken();
			int length = part.length();
			
			if(!stringMap.containsKey(length)){
				stringMap.put(length, part);
			}else{
				stringMap.put(length, stringMap.get(length) + " " + part);
			}
		}
		
		for(String put : stringMap.values()){
			result += put + " ";
		}
		
		println(result);
	}
}