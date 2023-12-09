import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run() {
		   for(int i = 1; i <= 100; i++) {
		      if(isSquare(i)) {
		         println(i);
		      }
		   }
		}

		private boolean isSquare(int i) {
			double root = Math.sqrt(i);
			return root == (int)root;
		}

}