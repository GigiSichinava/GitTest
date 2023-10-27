import acm.program.ConsoleProgram;

public class problem31 extends ConsoleProgram{
	
	private static final int SENTINEL = -1;
	
	public void run(){
		 
	while(true){	
		int n  = readInt ("Enter your number: ");
		if ( n == SENTINEL ){
			break;
		}
		if (isPrimeFast(n)){
			println("prime");
		}else{
			println("not prime");
		}	
			
	}
		
	}

	private boolean isPrimeFast(int n) {
		int result = 0;
		for (int i = 2 ; i * i <= n; i++){
			if (n % i == 0){
				
			}
		}
		
		return true;	
		
	}
}
