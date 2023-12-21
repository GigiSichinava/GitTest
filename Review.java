import java.awt.event.ActionEvent;
import java.text.MessageFormat.Field;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram{
	
	private JTextField field;
	
	public void run(){
		 JLabel label = new JLabel("Hello!");
		 add(label, SOUTH);
		 
		 JTextField field = new JTextField(10);
		 add(field, SOUTH);
		 
		 
		 JButton button = new JButton("Press me!");
		 add(button, SOUTH);
		 
		 addActionListeners();
	}
	
	public void actionPerformed(ActionEvent e) {
		println(field.getText());
	}

}