import acm.program.ConsoleProgram;

public class FinalsProblem4 extends ConsoleProgram{
	public void run(){
		 
		String line = readLine("Enter string: ");
		String result = "";
		
		for(int i = 0; i < line.length(); i++){
			result += Character.toString(line.charAt(line.length() - i - 1));
		}
		println("Result: " + result);
	}

}
