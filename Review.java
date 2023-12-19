import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram{
	public void run(){
		String number = readLine();
		int result = 0;
		
		for(int i = 0; i < number.length(); i++){
			int n = number.charAt(i) - '0';
			result = n * 10 + n;
		}
		println(result);
	}
}