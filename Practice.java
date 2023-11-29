import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		
		String text = readLine("text: ");
		String symbol = readLine("symbol: ");
		
		int count = 0;
		
		for(int i = 0; i < text.length(); i++){
			if(text.charAt(i) == symbol.charAt(0)){
				count++;
			}
		}
		println(count);
		
	}
}