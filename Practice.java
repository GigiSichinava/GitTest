import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		
		String text = readLine("Enter your text here: ");
		for(int i = 0; i < text.length(); i++){
			char left = text.charAt(i);
			char right = text.charAt(text.length() - i - 1);
			if(left != right){
				println("Negative");
				return;
			}
		}
		println("Positive");
		
	}
}