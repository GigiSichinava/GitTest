import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram {
	public void run() {

		try {
			BufferedReader reader = new BufferedReader(
					new FileReader("ConsoleProgrammSample.java"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}