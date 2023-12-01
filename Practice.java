import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram {
	public void run() {

		String mama = readLine("Mama: ");
		String shvili = readLine("Shvili: ");
		
	}

	private boolean amIYourFatherLuke(String mama, String shvili){
			
		for(int i = 0; i < shvili.length(); i++){
			for(int j = i + 1; j <= shvili.length(); j++){
				if(mama.contains(shvili.substring(i, j)) && shvili.substring(i, j).length() > mama.length() / 2){
					return true;
				}
			}
		}
	
		return false;
		}

}