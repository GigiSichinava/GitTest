import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.program.GraphicsProgram;

public class FinalsProblem2 extends GraphicsProgram{
	public void init(){
		
		JLabel width = new JLabel("width:");
		add(width, SOUTH);
		
		JTextField widthField = new JTextField(10);
		add(widthField, SOUTH);
		
		JLabel height = new JLabel("height");
		add(height, SOUTH);
		
		JTextField heightField = new JTextField(10);
		add(heightField, SOUTH);
		
		JButton add = new JButton("Add");
		add(add, SOUTH);
		
		JButton filter = new JButton("Filter");
		add(filter, SOUTH);
	}
}
