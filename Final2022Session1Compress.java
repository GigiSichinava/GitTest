import acm.program.ConsoleProgram;

public class Final2022Session1Compress extends ConsoleProgram{
	public void run(){
		
		String line = "aabcccccaa";
		String expected = "a2b1c5a2";
		println(line);
		println(expected);
		
		String result = "";
		
		for(int i = 1; i < line.length(); i++){
			char ch = line.charAt(0);
			int count = 1;
			if(ch != line.charAt(i)){
				result += ch;
				result += count;

			}else if(ch == line.charAt(i)){
				count++;
//				result += ch;
//				result += count;
			}
			ch = line.charAt(i);
		}
		
		println(result);
	}

}