import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	
	private static final String SENTINEL = "END";	
	
	public void run(){
		while(true){
			String s = readLine();
			if(s.equals(SENTINEL)){
				break;
			}
		}
		int numChars = distinctChars(s);
		if(numChars > maxChars){
			ans = s;
			
		}
		
	}
	
//	private boolean find1(String a, String b){
//		int index = 0;
//		for(int i = 0; i < a.length(); i++){
//			if(a.charAt(i) == b.charAt(index)){
//				index++;
//			}
//		}
//		return index == b.length();
//	}

	
	private boolean isAlternating(int num){
		
	}
	
	
	
}