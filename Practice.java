import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JTextField;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class Practice extends GraphicsProgram{

	private JButton button;
	private JTextField textField;
	private GLabel lastLabel;

	
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
		addLabel(line);
	}


	private void addLabel(String line) {
		if(lastLabel == null){
			lastLabel = new GLabel(line);
			add(lastLabel, 0, lastLabel.getAscent());
		}else{
			GLabel newLabel = new GLabel(line);
			add(newLabel, 0, lastLabel.getY() + newLabel.getAscent());
			lastLabel = newLabel;
		}
	}
}