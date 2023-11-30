import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		
		String text = readLine("Enter text: ");
		String symbol = readLine("Enter symbol: ");
		
		char ch = symbol.charAt(0);
		
		int count = 0;
		
		for(int i = 0; i < text.length(); i++){
			if(ch == text.charAt(i)){
				count++;
			}
		}
		println(count);
	}
}