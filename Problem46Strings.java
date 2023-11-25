import acm.program.ConsoleProgram;

public class Problem46Strings extends ConsoleProgram {
	private int countCharacters(String string, char c) {
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}

	public void run() {
		String text = readLine("Enter your text here: ");
		int maxCount = 0;
		char maxCharcater = 0;
		for (char c = 'a'; c <= 'z'; c++) {
			int count = countCharacters(text, c);
			if (count > maxCount) {
				maxCount = count;
				maxCharcater = c;
			}
		}
		println(maxCharcater);
	}
}


	//	public void run(){
	//		String text = readLine("Enter your text here: ");
	//		int maxCharacter = 0;
	//		int maxCount = 0;
	//	
	//		for(char x = 'a'; x <= 'z'; x++){
	//			int count = 0;
	//			for(int i = 0; i < text.length(); i++){
	//				if(text.charAt(i) == x){
	//					count++;
	//				}
	//			}
	//			if(count > maxCount){
	//			maxCount = count;
	//			maxCharacter = x;
	//			}
	//		}
	//		println(maxCharacter);
	//	}