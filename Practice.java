import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		
		try{
			BufferedReader bf = new BufferedReader(new FileReader("Practice.java"));
			while(true){
				String line = bf.readLine();
				if(line == null){
					break;
				}
				println(line);
			}
			bf.close();
		}catch(IOException e){
			e.getStackTrace();
		}
	}
}