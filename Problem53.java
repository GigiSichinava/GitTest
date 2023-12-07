import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Problem53 extends ConsoleProgram{
	
	private static final String FILENAME = "statistics.txt";
	
	public void run(){
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(FILENAME));
			String text = "";
			while(true){
				String line = reader.readLine();
				if(line == null){
					break;
				}
				text =  text + line + "/n";
			}
			countStatistics(text);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

	private void countStatistics(String text) {
		int symbolsCount = 0;
		int wordsCount = 0;
		int dotsCount = 0;
		int questionscount = 0;
		
		StringTokenizer tokenizer = new StringTokenizer(text, " ?!/.,", true);
		while(tokenizer.hasMoreTokens()){
			String token = tokenizer.nextToken();
			
		}
	}
}
