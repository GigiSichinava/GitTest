import acm.program.ConsoleProgram;

public class FinalsProblem6 extends ConsoleProgram{
	public void run(){
		
		String line = readLine();
		int count = 0;
		
		for(int i = 0; i < line.length(); i++){
			for(int j = i + 1; j <= line.length(); j++){
				String part = line.substring(i, j);
				if(hasSameAmount(part)){
					count++;
				}
			}
		}
		
		println(count);
	}

	private boolean hasSameAmount(String part) {
		int countA = 0;
		int countB = 0;
		
		for(int i = 0; i < part.length(); i++){
			char ch = part.charAt(i);
			if(ch == 'a'){
				countA++;
			}
			if(ch == 'b'){
				countB++;
			}
		}
		return countA == countB;
	}
}