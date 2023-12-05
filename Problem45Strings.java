import acm.program.ConsoleProgram;

public class Problem45Strings extends ConsoleProgram{

	public void run(){
		countSymbol(); 
	}

	private void countSymbol() {
		String text = readLine ("Enter your text here: ");
		String symbolInText = readLine ("Enter text that you are looking for: ");
		
		char symbol = symbolInText.charAt(0);
		
		int numberOfOccurances = 0;
		for (int i = 0; i < text.length(); i++){
			if(text.charAt(i) == symbol) {
				numberOfOccurances++;
				
			}
		}
		println(numberOfOccurances);
	}
}
