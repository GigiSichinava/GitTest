import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		
		String str = "beng biwo";
		println(str);
		
		String reversedStr = reverseString(str);
		println(reversedStr);
	}
	
	private String reverseString(String str){
		String result = " ";
		for(int i = 0; i < str.length(); i++){
			result = str.charAt(i) + result;
		}
		return result;
	}
}