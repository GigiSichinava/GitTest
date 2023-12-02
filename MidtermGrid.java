import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class MidtermGrid extends GraphicsProgram{
	private GRect axali;
	private GRect dzveli;
	private GRect obj;
	public void run(){
		addMouseListeners();
		grid();
	}
	private void grid(){
		for(int i = 0; i < 10; i ++){
			for(int j = 0; j < 10; j++){
				GRect rect = new GRect(50, 50);
				add(rect, i * 50, j * 50);
			}
		}
	}
	public void mouseClicked(MouseEvent e){
		obj = (GRect)getElementAt(e.getX(), e.getY());
		if(obj == null)return;
		if(obj != null && axali == null && dzveli == null){
			axali = obj;
			axali.setFilled(true);
			return;
		}
		if(axali != null && obj != null && dzveli == null){
			dzveli = axali;
			axali =  obj;
			axali.setFilled(true);
			return;
		}
		if(obj == dzveli){
			dzveli.setFilled(false);
			return;
		}
		if(obj == axali){
			axali.setFilled(false);
			axali = dzveli;
			return;
		}
		if (axali != null && dzveli != null && obj != null){
			dzveli.setFilled(false);
			dzveli = axali;
			axali = obj;
			axali.setFilled(true);
			return;
		}
		

	}

}