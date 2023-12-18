import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram{
	public void run(){
		String line = readLine();
		String symbol = readLine();
		
		char ch = symbol.charAt(0);
		
		int result = 0;
		for(int i = 0; i < line.length(); i++){
			if(ch == line.charAt(i)){
				result++;
			}
		}
		println(result);
	}
}