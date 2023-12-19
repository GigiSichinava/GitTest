import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram{
	public void run(){
		String a = readLine();
		String b = readLine();
		if(a.contains(b)){
			println(true);
		}
	}
}