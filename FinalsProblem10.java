import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.program.GraphicsProgram;

public class FinalsProblem10 extends GraphicsProgram{
	public void init(){
		JLabel label = new JLabel ("Move");
		add(label, SOUTH);
		JTextField textField = new JTextField(10);
		add(textField, SOUTH);
	}

}
