import java.util.StringTokenizer;
import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram {
	public void run() {

		String text = readLine("Text: ");
		println(beautify(text));
	}
	
		private String beautify(String text){
			StringTokenizer tokenizer = new StringTokenizer(text);
			String beautifuls = "";
			
			while(tokenizer.hasMoreTokens()){
				String currentWord = tokenizer.nextToken();
				beautifuls += reversed(currentWord);
			}
			return beautifuls;
		}
		
		private String reversed(String word){
			String reversed = "";
			for(int i = word.length() - 1; i >= 0; i--){
				reversed += word.charAt(i);
			}
			return reversed;
		}
}