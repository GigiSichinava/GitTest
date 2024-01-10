import acm.program.ConsoleProgram;

public class FinalsProblem4 extends ConsoleProgram{
	public void run(){
		
		String line = readLine();
		char[] chars = line.toCharArray();
		
		int left = 0;
		int right = line.length() - 1;
		
		while(left < right){
			if(!Character.isAlphabetic(chars[left])){
				left++;
			}else if(!Character.isAlphabetic(chars[right])){
				right--;
			}else{
				char temp = chars[left];
				chars[left] = chars[right];
				chars[right] = temp;
				left++;
				right++;
			}
		}
		String result = new String(chars);
		println(result);
	}
}