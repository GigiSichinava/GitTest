import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram{
	public void run(){
		
		String line = readLine();
		String used = "";
		
		for(int i = 0; i < line.length(); i++){
			char ch = line.charAt(i);
			if(!used.contains("" + ch));
			int amount = 0;
			for(int j = 0; j < line.length(); j++){
				if(ch == line.charAt(i)){
					amount++;
				}
			}
			println(ch + " : " + amount);

			used = used + ch;

		}
	}
}