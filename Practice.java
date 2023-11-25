import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		
		String s = readLine("enter your text");
		for(int i = 0; i < s.length(); i++){
			char left = s.charAt(i);
			char right = s.charAt(s.length() - 1 - i);
			if( left != right){
				println("negative");
				return;
				
			}
		}
		println("positive");
	}
}