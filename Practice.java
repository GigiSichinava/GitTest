import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		
		String text = readLine("Text :");
		String result = "";
		
		for(int i = 0; i < text.length() - 1; i++){
			if(text.charAt(i) != text.charAt(i + 1)){
				result = result + text.charAt(i);				
			}
			
		}
		println(result);
		
	}
}