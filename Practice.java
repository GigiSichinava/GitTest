import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		
		String text = readLine("Text :");
		String result = "";
		
		for(int i = 1; i < text.length(); i++){
			if(text.charAt(i) != text.charAt(i)){
				result = result + text.charAt(i);				
			}
			
		}
		println(result);
		
	}
}