import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
	
	String text = readLine("Text: ");
	String result = "";
	
	for(int i = text.length() - 1; i >= 0 ; i--){
	result += text.charAt(i);
	} 


	println(result);

	}
}
