import java.util.Arrays;

import acm.program.ConsoleProgram;

public class Practice extends ConsoleProgram{
	public void run(){
		
		int[] myArr = new int[10];
//		int[] myArr = {10, 20, 30};
		int[] myArr2 = {0, 5, 6, 7, 8};
	
		println(myArr[2]);
		println(myArr2[2]);
		
		myArr2[2] = 100;  // masivshi ragac adgilze sxva inti chavawerinet
		println(myArr2[2]);
		
		
		for(int i = 0 ; i < myArr.length; i++){  // masivis daprintva
			println(myArr[i]);			
		}
		
		
		println(myArr2); // ase misamarts dabewdavs 
		
		println(Arrays.toString(myArr2));
		
	}
}