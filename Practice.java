import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		
		String text = readLine("Text: ");
		String symbol = readLine("Symbol: ");
		
		char ch = symbol.charAt(0);
		
		int result = 0;
		
		for( int i = 0; i < text.length(); i++){
			if(text.charAt(i) == ch){
				result++;
			}
		}
		println(result);
	}
}