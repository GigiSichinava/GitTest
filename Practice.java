import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		
		String str = "beng biwo";
		println(str);
		
		String reversedStr = reveredstring(str);
		println(reversedStr);
	}
	
	private String reveredstring(String str){
		String result = " ";
		for(int i = 0; i < str.length(); i++){
			result = str.charAt(i) + result;
		}
		return result;
	}
}