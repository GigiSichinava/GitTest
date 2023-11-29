import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		
		String text = readLine("Text: ");
		String result = "";
		
		for(int i = 0; i < text.length(); i++){
			char ch = text.charAt(i);
			if(!result.contains("" + ch)){
			result += ch;	
			}
		}
		println(result);
		
	}
}