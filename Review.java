import javax.swing.JButton;
import javax.swing.JTextField;

import acm.program.GraphicsProgram;

public class Review extends GraphicsProgram{
	public void run(){
		
		JButton button = new JButton("Press me!");
		add(button, SOUTH);
		JTextField text = new JTextField(10);
		add(text, SOUTH);
		
	}
}