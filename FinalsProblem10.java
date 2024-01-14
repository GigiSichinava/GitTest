import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class FinalsProblem10 extends GraphicsProgram{
	
	private static final int N_ROWS = 8;
	private static final int N_COLS = 8;
	private int width = getWidth() / N_COLS;
	private int height = getHeight() / N_ROWS;
	
	public void init(){
		setSize(600,600);
		JLabel label = new JLabel ("Move");
		add(label, SOUTH);
		JTextField textField = new JTextField(10);
		add(textField, SOUTH);
		textField.addActionListener(this);
		
		addActionListeners();
	}
	
	public void run(){
		for(int i = 0; i < N_ROWS; i++){
			for(int j = 0; j < N_COLS; j++){
				int rectWidth  = getWidth() / N_COLS;
				int rectHeight = getHeight() / N_ROWS;
				GRect rect = new GRect(rectWidth, rectHeight);
				add(rect, i * rectWidth, j * rectHeight);
			}
		}
		
	}

}
