	import stanford.karel.*;

	public class problem007 extends SuperKarel{
		public void run(){
			
			while(frontIsClear()){
				Fill();
			}
		}	
		private void Fill(){
			while(frontIsClear()){
				if(!beepersPresent()){
					putBeeper();
				}else{
					move();
					
				}
			}
	
		}
			
			
			
			
		}
	
	
}




