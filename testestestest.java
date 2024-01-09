import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class testestestest extends ConsoleProgram{
	public void run(){
		
		ArrayList<String> students = new ArrayList<>();
		students.add("ali");
		students.add("gio");
		ProgramingMethodolohyClass classB = new ProgramingMethodolohyClass();
	//	ProgramingMethodolohyClass classB = new ProgramingMethodolohyClass(students);
		
		
		println(classB.getScore("ali"));
	}

}
