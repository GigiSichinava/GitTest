import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram{
	public void run(){
		
		JLabel label = new JLabel("Hello!");
		add(label, SOUTH);
		
		JTextField field= new JTextField(10);
		add(field, SOUTH);
		
		
	}
}