import acm.program.ConsoleProgram;

public class Problem47Strings extends ConsoleProgram{
	
	public void run(){
		
		String s = readLine("Enter your text here: " );
		if(isPalindrom(s)) {
			println("Positive");
		}else{
			println("Negative");
		}
		
		
	}

	private boolean isPalindrom(String s) {
			for (int i = 0; i < s.length(); i++){
				char left = s.charAt(i);
				char right = s.charAt(s.length() - i - 1);
				if(left != right){
					return(false);
				}
			}
		return false;
	}
}


//	public class Review extends ConsoleProgram {
//	    public void run() {
//	        String s = readLine("Enter your text here: ");
//	        for (int i = 0; i < s.length(); i++) {
//	            char left = s.charAt(i);
//	            char right = s.charAt(s.length() - i - 1);
//	            if (left != right) {
//	                println("Negative");
//	                return;
//	            }
//	        }
//	        println("Positive");
//	    }
//	}

