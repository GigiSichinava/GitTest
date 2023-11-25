import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		
		String text = readLine("Enter your text here: ");
		String symbolInText = readLine("Symbol you are looking for: ");
		
		char symbol = symbolInText.charAt(0);
		int numberofOccurance = 0;
		
		for(int i = 0; i < text.length(); i++){
			if(text.charAt(i) == symbol){
				numberofOccurance++;
				
			}
		}
		println(numberofOccurance);
	}
}