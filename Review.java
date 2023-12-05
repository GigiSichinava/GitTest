import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram {
	public void run() {

		try {
			BufferedReader reader = new BufferedReader(new FileReader("ConsoleProgrammSample.java"));

			while (true) {
				String line = reader.readLine();
				if(line == null){
					break;
				}
				println(line);
			}
			// System.out.println("read file");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}