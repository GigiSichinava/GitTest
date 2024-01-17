import acm.program.ConsoleProgram;

public class Final2022Session1Compress extends ConsoleProgram{
	public void run(){
		
		String line = "aabcccccaa";
		String expected = "a2b1c5a2";
		println(line);
		println(expected);
		
		String result = "";
		int count = 1;

		for(int i = 1; i < line.length(); i++){
			if(line.charAt(i - 1) != line.charAt(i)){
				result += line.charAt(i - 1);
				result += count;
				count = 1;

			}else{
				count++;
			}
			
//	        result += line.charAt(line.length() - 1);

			
		}
		
		println(result);
	}

}