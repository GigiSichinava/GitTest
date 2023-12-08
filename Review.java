import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram{
	public void run(){
		int score = 77;
		if(score >= 90){
			println("a");
		}else if(score >= 80){
			println("b");
		}else if(score >= 70){
			println("C");
		}
	}
}