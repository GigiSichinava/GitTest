import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	private int count = 0;
	
	public void run(){
		
		String text = readLine("Text: ");
		String symbol = readLine("Symbo: ");
		
		char ch = symbol.charAt(0);
		
		for(int i = 0; i < text.length(); i++){
			if(ch == text.charAt(i)){
				count++;
			}
		}
		println(count);
		
	}
	
			
}