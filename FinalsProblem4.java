import acm.program.ConsoleProgram;

public class FinalsProblem4 extends ConsoleProgram{
	public void run(){
		 
		String line = readLine();
		String result = "";
		
		for(int i = 0; i < line.length() - 1; i++){
			result += Character.toString(line.charAt(line.length() - i));
		}
		println(result);
	}

}
