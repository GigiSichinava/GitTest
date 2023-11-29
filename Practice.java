import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		
		String text = readLine("text: ");
		printNewString(text);
		
	}

	private void printNewString(String text) {
		String result = "";
		for(int i = 0 ; i < text.length(); i++){
			char ch = text.charAt(i);
			if(text.charAt(i) != text.charAt(i - 1)){
				result = result + ch;
			}	
		}
		println(result);
	}
}