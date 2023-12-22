import acm.program.ConsoleProgram;

public class Problem54 extends ConsoleProgram {
    public void run() {
       
    	int n = readInt("Enter numbers (more than one): ");
    	if(n < 2){
    		println("Array has to contain minimum 2 numbers!");
    		return;
    	}
    	
    	int[] myArray = new int[n];
    	for(int i = 0; i < myArray.length; i++){
    		myArray[i] = readInt("Enter number " + (i + 1) + " : " );
    	}

    	int maxNum1, maxNum2;
    	
    	if(myArray[0] > myArray[1]){
    		maxNum1 = myArray[0];
    		maxNum2 = myArray[1];
    	}else{
    		maxNum1 = myArray[1];
    		maxNum2 = myArray[0];
    	}
    	
    	for(int j  = 2 ; j < myArray.length; j++){
    		if(myArray[j] > maxNum1){
    			maxNum1 = myArray[j];
    			maxNum2 = maxNum1; 
    		}else if(myArray[j] > maxNum2 && myArray[j] != maxNum1){
    			maxNum2 = myArray[j];
    		}
    	}
    	println("First biggest number is: " + maxNum1);
    	println("Second biggest number is: " + maxNum2);
    }
}
