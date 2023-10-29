

import acm.program.*;

public class Practice extends ConsoleProgram {
	
	private static final int SENTINEL = 1;
	
	public void run() {
	
		int n = readInt ("Enter a number: ");
		
		while (n != SENTINEL){			
			if ( n % 2 == 0){
				int	nextNumber = n / 2;
				println (n + " is even so I take half: " + nextNumber);
				n = nextNumber;
				
			
			
					if (nextNumber % 2 != 0){
						if (nextNumber != SENTINEL){
						nextNumber = n * 3 + 1;
						println (n + " is odd, so I make 3n + 1: " + nextNumber);
						n = nextNumber;
						
						}	
					}
			} 
			else {
				if (n % 2 != 0){
					int nextNumber = n * 3 + 1;
					println (n + " is odd, so I make 3n + 1: " + nextNumber);
					n = nextNumber;
						
				}
			
				if ( n % 2 == 0){
					int	nextNumber = n / 2;
					println (n + " is even so I take half: " + nextNumber);
					n = nextNumber;
					

				}
			 
			}
		}
	}
}

