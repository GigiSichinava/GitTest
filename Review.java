import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.program.GraphicsProgram;

public class Review extends GraphicsProgram{
	
	private JTextField field1;
	private JTextField field2;
	private JLabel label1;
	private JLabel label2;
	private JButton button1;
	private JButton button2;
	
	public void init(){
		field1 = new JTextField(10);
		add(field1, WEST);
		
		field2 = new JTextField(10);
		add(field2, EAST);
		
		label1 = new JLabel("User 1");
		add(label1, WEST);
		
		label2 = new JLabel("User 2");
		add(label2, EAST);
		
		button1 = new JButton("Send");
		add(button1, WEST);
		
		button2 = new JButton("Send");
		add(button2, EAST);
	}
}