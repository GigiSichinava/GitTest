import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import acm.program.ConsoleProgram;

public class Problem52 extends ConsoleProgram {
	public void run() {

		try {
			BufferedReader reader = new BufferedReader(new FileReader("PaintBrush.java"));
			while (true) {
				String line = reader.readLine();
				if (line == null) {
					break;
				}
				println(line);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}