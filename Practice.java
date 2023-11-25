import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		
		String text = readLine("Enter your text here: ");
		String symbolInText = readLine("Symbol you are looking for: ");
		
		char ch = symbolInText.charAt(0);
		int numberOfSymbols = 0;
		
		for(int i = 0; i < text.length(); i++){
			if(text.charAt(i) == ch){
			numberOfSymbols++;
			}
		}
		println(numberOfSymbols);
		
	}
}