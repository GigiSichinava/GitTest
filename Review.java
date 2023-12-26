import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram{
	public void run(){
		
		String str1= readLine();
		String str2 = readLine();
		println(isAnagram(str1, str2));
	}
	
		private boolean isAnagram (String str1, String str2){
			
			int[] string1 = new int[str1.length()]; 
			int[] string2 = new int[str2.length()];
			
			for(int i = 0; i < string1.length; i++){
				if(string1[i] == string2[string2.length - 1]){
					return true;
				}
			}
			
			return false;
		}
}