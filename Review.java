import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram{
	public void run(){
		
		while(true){
			String str1= readLine();
			String str2 = readLine();
			println(isAnagram(str1, str2));
			}
		}
		
	
		private boolean isAnagram (String str1, String str2){
			
			int[] string1 = new int[str1.length()]; 
			int[] string2 = new int[str2.length()];
			
			for(int i = 0; i < string1.length; i++){
				string1[i] = str1.charAt(i);
				string2[i] = str2.charAt(i);
			}
			
			for(int j = 0; j < string1.length; j++){
				if(string1[j] == string2[string2.length - 1 -j]){
					return true;
				}
			}
			
			return false;
		}
}