import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class problem35 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		int sum = 0;
		for (int i = 0; i < 1000; i++) {
			int count = oneSimulationCount();
			sum += count;
		}
		println("average is: " + sum / 1000.0);
	}

	private int oneSimulationCount() {
		int coin = 0;
		int count = 0;
		while (coin != 1) {
			coin = rgen.nextInt(0, 1);
			count++;
		}
		return count;
	}
}