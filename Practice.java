import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		
		String a = readLine("1");
		String b = readLine("2");
		
	}
	
	private boolean find1(String a, String b){
		int index = 0;
		for(int i = 0; i < a.length(); i++){
			if(a.charAt(i) == b.charAt(index)){
				index++;
			}
		}
		return index == b.length();
	}

}