import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		String text = readLine("Enter text");
		String replaced = removeDuplications(text);
		println(replaced);
	}
	
	private String removeDuplications(String text){
		text.replace("a", "");
		return text;
		
	}
}