import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram{
	public void run(){
		
		String line = readLine();
		char maxChar = line.charAt(0);
		int maxOccur = 0;
		
		for(int i = 0; i < line.length(); i++){
			if(maxChar == line.charAt(i)){
				maxChar = line.charAt(i);
				maxOccur++;
			}
		}
		println(maxChar);
		println(maxOccur);
	}
}