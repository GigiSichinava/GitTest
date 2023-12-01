import acm.program.GraphicsProgram;

public class Practice extends GraphicsProgram{
	public void run(){
	
		String mama = readLine("Mama: ");
		String shvili = readLine("Shvili: ");
		println(amIYourFatherLuke(mama, shvili));
		
	}
	
	private boolean amIYourFatherLuke(String mama, String shvili){
		
		for(int i = 0; i < shvili.length(); i++){
			for(int j = 1; j <= shvili.length(); j++){
				if(mama.contains(shvili.substring(i, j)) && shvili.substring(i, j).length() > mama.length() / 2);
					return true;
			}
		}
		
		return false;
	}
}