import java.util.Iterator;

import acm.program.ConsoleProgram;

public class SchoolTest extends ConsoleProgram {
	public void run() {
		School school = new School();
		
		school.addTeacher("mari");
		school.addTeacher("nino");

		school.addSubject("mari", "cs");
		school.addSubject("mari", "math");
		school.addSubject("nino", "physics");
		school.addSubject("ana", "physics");

		school.addPupil("ana", "cs");
		school.addPupil("ana", "physics");
		school.addPupil("salo", "cs");
		school.addPupil("sofo", "pe");

		
	}
}