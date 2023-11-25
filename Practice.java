import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram {
	public void run(){
		
	String string = readLine("ur txt: ");
	for(int i = 0; i < string.length(); i++){
		char left = string.charAt(i);
		char right = string.charAt(string.length() - 1 - i);
		if(left != right){
			println("negative");
			return;
		}
		
	}
	println("positive");
	}
}