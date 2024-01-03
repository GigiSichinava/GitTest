import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JTextField;

import acm.program.GraphicsProgram;

public class Practice extends GraphicsProgram{

	@Override
	public void init(){
		JButton button = new JButton("Enter");
		add(button, SOUTH);
		button.addActionListener(this);
		JTextField textField = new JTextField(30);
		add(textField, SOUTH);
		textField.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		String line = e.getActionCommand();
		println(line);
	}
}