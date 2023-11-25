import acm.program.ConsoleProgram;

public class Problem25 extends ConsoleProgram{
	public void run(){
		int n = readInt("Enter n: ");
		int m = readInt("Enter m: ");
		
		int gcd = gcd(n, m);
		println("GCD is: " + gcd);
		
	}

	private int gcd(int n, int m) {
		for (int i = Math.min(n, m); i >= 1; i--) {
			if(n % i == 0 && m % i == 0)
			return i;
		}
		return -1;
	}
}



//	public class Problem25 extends ConsoleProgram {
//	    public void run() {
//	        int n = readInt("Enter n: ");
//	        int m = readInt("Enter m: ");
//	
//	        int gcd = gcd(n, m);
//	        println("GCD is: " + gcd);
//	    }
//	
//	    private int gcd(int n, int m) {
//	        while (m != 0) {
//	            int temp = m;
//	            m = n % m;
//	            n = temp;
//	        }
//	        return n;
//	    }
//	}



//	public class Practice extends ConsoleProgram {
//		public void run() {
//			int num1 = readInt("Enter the first number: ");
//			int num2 = readInt("Enter the second number: ");
//	
//			int a = num1;
//			int b = num2;
//	
//			while ( b != 0){
//				int temp = b;
//				b = a % b;
//				a = temp;
//			}
//			int gcd = a;
//			println(a);
//		}
//	}