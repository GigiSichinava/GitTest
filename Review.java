
import acm.graphics.GOval;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

public class Review extends ConsoleProgram {

	private static final int PAUSE = 10;
	private static final int R = 50;
	private GOval oval;

	public void run() {
	
		String text = readLine("Enter you text here");
		String symbol = readLine("Enter your symbol");
		
		char x = symbol.charAt(0);
		int occurance = 0;
		
		for(int i = 0; x < text.length(); i++){
			if (text.charAt(i) == x) {
				occurance++;
			}
		}
			println(occurance);
}
}