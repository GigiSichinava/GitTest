import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import acm.program.GraphicsProgram;

public class Problem72 extends GraphicsProgram{
	
	private School school;
	private JTextField teachField;
	
	public void init(){
		school = new School();
		teachField = new JTextField(10);
		
		teachField.addActionListener(this);
		add(teachField, SOUTH);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == teachField){
			addTeacher(teachField.getText());
		}
	}

	private void addTeacher(String text) {
		if(text != null && !text.equals("")){
			school.addTeacher(text);
		}
		
	}
}
