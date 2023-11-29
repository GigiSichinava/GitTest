import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		
		String text = readLine("Text: ");
		
		for(char x = 'a'; x < 'z'; x++){
			int count = 0;
			for(int i = 0; i < text.length(); i++){
				if(text.charAt(i) == x){
					count++;
				}
			}
			println(x + ":" + count);

		}
	}
}