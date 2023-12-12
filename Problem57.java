import java.util.Arrays;

import acm.program.ConsoleProgram;

public class Problem57 extends ConsoleProgram{
	public void run(){
	
	String str1 = readLine();
	String str2 = readLine();
	println(Arrays.equals(check(str1), check(str2)));
	}
	
	
	private int[] check(String str1){
		int[] Array = new int [26];
		for(int i = 0; i < str1.length(); i++){
			Array[str1.charAt(i) - 'a']++;
		}
		return Array;
	}
}
