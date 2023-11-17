
import acm.graphics.GOval;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

public class Review extends ConsoleProgram {

	public void run() {

		String text = readLine("Enter your text here: ");
		String symbol = readLine("Symbol you are looking for ");

		char x = text.charAt(0);
		int numberOfOccurances = 0;
		
		for(int i = 0; i < text.length(); i++ ){
			if(text.charAt(i) == x){
				numberOfOccurances++;
			}
		}
		println(numberOfOccurances);
	}
}