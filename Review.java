import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram{
	public void run(){
	String str = readLine();
	
	String newstr = str.substring(3, 4);
	println(newstr);
	}
}