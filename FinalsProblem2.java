import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class FinalsProblem2 extends GraphicsProgram{
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	private JTextField widthField;
	private JTextField heightField;
	
	public void init(){
		
		JLabel width = new JLabel("width:");
		add(width, SOUTH);
		
		JTextField widthField = new JTextField(10);
		add(widthField, SOUTH);
		
		JLabel height = new JLabel("height");
		add(height, SOUTH);
		
		JTextField heightField = new JTextField(10);
		add(heightField, SOUTH);
		
		JButton add = new JButton("Add");
		add(add, SOUTH);
		add.addActionListener(this);
		
		JButton filter = new JButton("Filter");
		add(filter, SOUTH);
		
		addActionListeners();
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("Add")){
			int width = Integer.parseInt(widthField.getText());
			int height = Integer.parseInt(heightField.getText());
			
			GRect rect = new GRect(width, height);
			add(rect, rgen.nextInt(0, getWidth() - width), rgen.nextInt(getHeight() - height));
			
		}
	}
}
