
/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

import acm.program.*;

public class Practice extends ConsoleProgram {

	private static final int SENTINEL = 1;

	public void run() {

		int n = readInt("Enter a number: ");
		int steps = 0;

		// use while statement when n doesn't equal to 1
		while (n != SENTINEL) { 	
			if (n % 2 == 0) { 		// if first number is even
				int nextNumber = n / 2; 	// divide even number
				println(n + " is even so I take half: " + nextNumber);
				n = nextNumber;

//				if (nextNumber % 2 != 0) { 			// when n is odd
//					if (nextNumber != SENTINEL) { 	// check if next number equals to 1
//													
//						nextNumber = n * 3 + 1; 	// while number is odd use n * 3 + 1 formula
//												
//						println(n + " is odd, so I make 3n + 1: " + nextNumber);
//						n = nextNumber;
//					}
//				}
			}

			else {

				if (n % 2 != 0) { 				// if first number is odd
					int nextNumber = n * 3 + 1; // while number is odd use n * 3 + 1 formula
												
					println(n + " is odd, so I make 3n + 1: " + nextNumber);
					n = nextNumber;
				}

//				if (n % 2 == 0) { 			// if first number is even
//					int nextNumber = n / 2; // divide even number
//					println(n + " is even so I take half: " + nextNumber);
//					n = nextNumber;
//				}
			}
			steps++;
		}
		println("This process took " + steps + " steps to reach 1.");
	}
}
