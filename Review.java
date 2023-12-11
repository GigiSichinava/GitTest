import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram{
	public void run(){
		
		String str1 = readLine();
		String str2 = readLine();
		String result = "";
		
		int maxLength = Math.max(str1.length(), str2.length());
		for(int i = 0; i < maxLength; i++){
			if(i < str1.length()){
				result += str1.charAt(i);
			}
			if(i < str2.length()){
				result += str2.charAt(i);
			}
		}
		println(result);
	}
}
