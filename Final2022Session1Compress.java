import acm.program.ConsoleProgram;

public class Final2022Session1Compress extends ConsoleProgram{
	public void run(){
		
		String line = "aabcccccaa";
		String expected = "a2b1c5a2";
		println(line);
		println(expected);
		
		String result = "";
		
		for(int i = 1; i < line.length(); i++){
			char firstChar = line.charAt(i);
			int count = 1;
			if(firstChar == line.charAt(i)){
				count++;
			}else{
				count = 1;
				result += count;
				result += line.charAt(i);
			}
			
			
		}
		
		println(result);
	}

}