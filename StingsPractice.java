import acm.program.ConsoleProgram;

public class StingsPractice extends ConsoleProgram{
	public void run(){
		
		String str1 = "mari";
		String str2 = "mari";
		String str3 = new String ("mari");
		
		println("1, 2 " + (str1 == str2) + " " +  str1.equals(str2));
		println("1, 3 " + (str1 == str3) + " " + str1.equals(str3));
		
		
		
		
	}

}
