import acm.program.ConsoleProgram;

public class Final2022Session1Compress extends ConsoleProgram{
	public void run(){
		
		String line = "aabcccccaa";
		String expected = "a2b1c5a2";
		println(line);
		println(expected);
		
		String result = "";
		
		for(int i = 0; i < line.length() - 1; i++){
			char ch = line.charAt(i);
			int count = 1;
			if(ch != line.charAt(i + 1)){
				count++;
				result += count + line.charAt(i);
			}
			
		}
		
		println(result);
	}

}