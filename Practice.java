
//Problem 52

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram {
	private static final String FILENAME = "Practice.java";

	public void run() {
		try {   // aq iwereba kodi da tu daerorda gadmava catchshi
			BufferedReader reader = new BufferedReader(new FileReader("FILENAME"));
			
			println("Correct");
			while(true){
				try {
					String newLine = reader.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		
		} catch (FileNotFoundException e) {  // tu try shi kodi daerorda gadmova aq
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			println("Mistake");
		}

	}
}