import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		
		try{
			BufferedReader rd = new BufferedReader(new FileReader("Practice.java"));
			while(true){
				String line = rd.readLine();
				if(line == null){
					break;
				}
				println(line);
			}
			rd.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}