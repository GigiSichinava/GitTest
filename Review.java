import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram{
	public void run(){
		String num = readLine("Enter Number: ");
		int ans = stringToInteger(num);
		print(ans);
	}

	private int stringToInteger(String num) {
		int res = 0;
		for(int i = 0; i < num.length(); i++){
			int n = num.charAt(i) - '0';
			res = res * 10 + n;
		}
		return res;
	}
}




//		public class Problem49 extends ConsoleProgram {
//		    public void run()St {
//		        String num = readLine("Enter Number: ");
//		        int res = 0;
//		
//		        for (int i = 0; i < num.length(); i++) {
//		            int n = num.charAt(i) - '0';
//		            res = res * 10 + n;
//		        }
//		
//		        print(res);
//		    }
//		}
