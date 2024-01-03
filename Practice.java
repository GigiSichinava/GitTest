import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JTextField;

import acm.program.GraphicsProgram;

public class Practice extends GraphicsProgram{

	private JButton button;
	private JTextField textField;
	
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
		String line = textField.getText();
		if(line.isEmpty()){
			return;
		}
		textField.setText("");
		
	}
}