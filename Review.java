import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram{
	public void run(){
		while(true){
			String s = readLine("Enter text: ");
			println(isProperString(s));
		}
		
	}

	private boolean isProperString(String s) {
		char prevChar = 'a' - 1; // auto cast between char and int
		for(int i = 0; i < s.length(); i++){
			char currChar = s.charAt(i);
			if(Character.isLowerCase(currChar)){
				if(currChar <= prevChar){ // მკაცრად ზრდადია ტექსტი 
					return false;
				}
				prevChar = currChar;
			}
		}
		return true;
	}
}