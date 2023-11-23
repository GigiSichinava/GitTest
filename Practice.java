import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void  run(){
		int x = 10;
		int b = readInt("Enter your text");
		
		if (b > x){
			println("Biggest num between this two is: " + b);
		}else {
			println(x);
		}
			
	}
}