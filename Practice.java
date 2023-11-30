import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram {
	public void run() {

		String text = readLine("Text: ");
		
		if(isPalindrom(text)){
			println("+");
		}else{
			println("-");
		}
	}
		
		private boolean isPalindrom(String text){
		for (int i = 0; i < text.length(); i++) {

			if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
			return(false);
			}
		}
		return(true);
		}
	}
