import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class Review extends GraphicsProgram{
	
	private JTextField field1;
	private JTextField field2;
	private JLabel label1;
	private JLabel label2;
	private JButton button1;
	private JButton button2;
	
	private GLabel text1;
	private GLabel text2;
	
	private int text1Y;
	private int text2Y;
	
	public void init(){
		label1 = new JLabel("User 1");
		field1 = new JTextField(10);	
		field1.addActionListener(this);
		button1 = new JButton("Send");
	
		add(label1, WEST);
		add(field1, WEST);
		add(button1, WEST);
		
		

		label2 = new JLabel("User 2");
		field2 = new JTextField(10);
		field2.addActionListener(this);
		button2 = new JButton("Send");
		
		add(label2, EAST);
		add(field2, EAST);
		add(button2, EAST);

		addActionListeners();
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == field1 || e.getSource() == button1){
			text1 = new GLabel(field1.getText());
			add(text1, text1.getWidth() * 1.2, text1.getAscent() + text1Y);
			text1Y += text1.getAscent() * 2;
            text1.setFont("Dialog-18");
			field1.setText("");
		}
		if(e.getSource() == field2 || e.getSource() == button2){
			text2 = new GLabel(field2.getText());
			text2Y += text2.getAscent() * 2;
			add(text2, getWidth() - text2.getWidth() * 1.5, text2Y);
            text2.setFont("Dialog-18");
			field2.setText("");
		}
	}
	
}