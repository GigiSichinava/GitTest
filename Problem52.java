import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import acm.program.ConsoleProgram;

public class Problem52 extends ConsoleProgram {
	public void run() {

		try {
			BufferedReader reader = new BufferedReader(new FileReader("Problem52.java"));
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




////Problem 52
//
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//
//import acm.program.ConsoleProgram;
//
//public class Practice extends ConsoleProgram {
//	private static final String FILENAME = "Practice.java";
//
//	public void run() {
//		try {
//			BufferedReader reader = new BufferedReader(new FileReader(FILENAME));
//
//			println("Correct");
//			while (true) {
//				String newLine = reader.readLine();
//				if (newLine == null) {
//					break;
//				}
//				println(newLine);
//			}
//			reader.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//
//			println("Mistake");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//}