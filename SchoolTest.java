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

		Iterator<String> pup = school.getPupils("mari");
		println("\nTest 1: Pupils of: mari");
		println("EXPECTED: salo, ana");
		print("ACTUAL: ");
		printIteratorElems(pup);
		
		Iterator<String> pup1 = school.getPupils("sandro");
		println("\nTest 2: Pupils of: sandro");
		println("EXPECTED: null");
		print("ACTUAL: ");
		printIteratorElems(pup1);

		println("\nTest 3: Teachers of: ana");
		println("EXPECTED: mari, nino");
		print("ACTUAL: ");
		Iterator<String> t = school.getTeachers("ana");
		printIteratorElems(t);

		println("removing mari");
		school.removeTeacher("mari");
		
		println("\nTest 4: Teachers of: ana");
		println("EXPECTED: nino");
		print("ACTUAL: ");
		t = school.getTeachers("ana");
		printIteratorElems(t);


		println("removing gio");
		school.removeTeacher("gio");
		
	}
	
	private void printIteratorElems(Iterator<String> it) {
		if (it == null) {
			println("null");
		} else {
			while (it.hasNext()) {
				print(it.next() + ", ");
			}
			println();
		}
	}
}