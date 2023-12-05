import java.util.Arrays;

import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram {
	public void run() {

		int[] array = new int[10];
//		int[] array2 = {10, 20, 30, 40};
		int[] a = array;
		println(Arrays.toString(array));  // es printavs masivs stringad
		
		int[] copy = Arrays.copyOf(array,  4); // <-- 4 ro weria, nishnavs ramdeni wevri minda wamovigo dasakopireblad
		println(Arrays.toString(copy));  
	}
}