import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JTextField;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class Problem68 extends GraphicsProgram{
	
	private JTextField textField;
	private JButton button;
	private GLabel lastLabel;

	
	@Override
	public void init(){
		textField = new JTextField(30);
		button = new JButton("Enter");
		add(textField, SOUTH);
		add(button, SOUTH);
		textField.addActionListener(this);
		button.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		String text = textField.getText();
		if(text.isEmpty()){
			return;
		}
		textField.setText("");
		addLabel(text);
	}
	
	private void addLabel(String text){
		if(lastLabel == null){
			lastLabel = new GLabel(text);
			add(lastLabel, 0, lastLabel.getAscent());
		}else{
			GLabel newLabel = new GLabel(text);
			add(newLabel, 0, lastLabel.getY() + newLabel.getAscent());
			
		}
	}
}
