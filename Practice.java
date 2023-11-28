import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		
	}
	
	private boolean find(String a, String b){
		int index = 0;
		for(int i = 0; i < a.length(); i++){
			if(a.charAt(i) == b.charAt(index)){
				index++;
			}
		}
		return index == b.length();
	}
}